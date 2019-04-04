package com.manash.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Vehicle implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx=null;
	
	private Vehicle(String beanId) {
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
		//get dependency class objects (Dependency lookup)
		engine=ctx.getBean(beanId,Engine.class);
		engine.start();
		System.out.println("journey starts from "+source);
		System.out.println("Moving=================>>>>>>>>>>>>>");
		System.out.println("journey ends at "+dest);
		engine.stop();
	}
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
}
