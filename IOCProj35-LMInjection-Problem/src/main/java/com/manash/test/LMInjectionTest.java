package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.MyServletContainer;

public class LMInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		container=ctx.getBean("container",MyServletContainer.class);
		container.processRequest("Hello");
		container.processRequest("hii");
		((AbstractApplicationContext) ctx).close();
	}
}
