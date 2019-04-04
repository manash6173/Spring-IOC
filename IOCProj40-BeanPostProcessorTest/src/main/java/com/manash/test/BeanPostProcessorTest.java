package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.service.Service;

public class BeanPostProcessorTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Service service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get service bean class object
		service=ctx.getBean("service",Service.class);
		//invoke  methods
		service.registerStudent("raja", "Hyd", "java");
		System.out.println("=============================");
		service.registerEmployee("rani", "Mum","Programer");
		System.out.println("--------------------------------------------");
		service.registerStudent("muna", "delhi", ".net");
		System.out.println("=============================");
		service.registerEmployee("ramesh", "vizag","Trainer");
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}
}

