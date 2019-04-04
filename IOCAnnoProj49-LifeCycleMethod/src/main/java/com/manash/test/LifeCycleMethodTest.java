package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.WishMessageGenerator;

public class LifeCycleMethodTest {

	public static void main(String[] args) {
		WishMessageGenerator wmg=null;
		ApplicationContext ctx=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.wishMessage("  Manash"));
		//close IOC Container
		((AbstractApplicationContext) ctx).close();
	}
}
