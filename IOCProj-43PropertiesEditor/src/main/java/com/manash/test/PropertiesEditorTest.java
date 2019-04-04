package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.IntAmtCals;

public class PropertiesEditorTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntAmtCals cals=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get Target bean class object
		cals=ctx.getBean("IntCals",IntAmtCals.class);
		System.out.println("Total Amount::"+cals.calcAmt());
		((AbstractApplicationContext) ctx).close();
	}
}
