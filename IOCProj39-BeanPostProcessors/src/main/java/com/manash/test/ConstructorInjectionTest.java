package com.manash.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.manash.beans.WishMessage;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessage wm=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		wm=ctx.getBean("m",WishMessage.class);
		System.out.println("WishMessage object::"+wm.sayHello("manash"));
		((AbstractApplicationContext) ctx).close();
	}
}
