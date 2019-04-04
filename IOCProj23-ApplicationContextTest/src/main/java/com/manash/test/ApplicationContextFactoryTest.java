package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.WishMessageGenerator;

public class ApplicationContextFactoryTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator wmg=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.wishMessage("Manash"));
		((AbstractApplicationContext) ctx).close();
	}

}
