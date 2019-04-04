package com.manash.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaCodeTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator wmg=null;
		//create IOC Container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg.wishMessage("Manash"));
		//close IOC Container
		((AbstractApplicationContext) ctx).close();
	}
}
