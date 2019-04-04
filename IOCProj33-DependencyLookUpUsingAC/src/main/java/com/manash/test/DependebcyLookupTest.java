package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.manash.beans.VehicleTraditionalLookUp;

public class DependebcyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VehicleTraditionalLookUp vehicle=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get target class object
		vehicle=ctx.getBean("vehicle",VehicleTraditionalLookUp.class);
		vehicle.journey("hyd","vizag");
		vehicle.entertainment();
		vehicle.soundHorn();
		((AbstractApplicationContext) ctx).close();	
	}
}
