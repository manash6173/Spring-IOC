package com.manash.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleTraditionalLookUp {
	private String beanId;
	
	private VehicleTraditionalLookUp(String beanId) {
		this.beanId = beanId;
		System.out.println("Vehicle 1-param constructor");
	}
	public void entertainment() {
		System.out.println("Playing Musics!!");
	}
	public void soundHorn() {
		System.out.println("Sound Horn!!");
	}
	public void journey(String source,String dest) {
		Engine engine=null;
		ApplicationContext ctx=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get dependency class objects (Dependency lookup)
		engine=ctx.getBean(beanId,Engine.class);
		engine.start();
		System.out.println("journey starts from "+source);
		System.out.println("Moving=================>>>>>>>>>>>>>");
		System.out.println("journey ends at "+dest);
		engine.stop();
		((AbstractApplicationContext) ctx).close();
	}

}
