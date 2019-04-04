package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.BeanSystemProperties;

public class SystemPropertiesTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BeanSystemProperties bsp=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get Bean class object
		bsp=ctx.getBean("bsp",BeanSystemProperties.class);
		System.out.println(bsp);
		System.out.println(System.getenv());
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
