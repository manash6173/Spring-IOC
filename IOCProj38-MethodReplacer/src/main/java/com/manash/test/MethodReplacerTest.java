package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.service.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		BankService service=null;
		ApplicationContext ctx=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		service=ctx.getBean("bs",BankService.class);
		System.out.println(service.intrAmtCals(100000.0f,12));
		((AbstractApplicationContext) ctx).close();
	}
}
 