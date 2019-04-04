package com.manash.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	
	public void entertainment() {
		System.out.println("Playing Musics!!");
	}
	public void soundHorn() {
		System.out.println("Sound Horn!!");
	}
	public void journey(String source,String dest) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Engine engine=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
		//get dependency class objects (Dependency lookup)
		engine=factory.getBean("engine",Engine.class);
		engine.start();
		System.out.println("journey starts from "+source);
		System.out.println("Moving=================>>>>>>>>>>>>>");
		System.out.println("journey ends at "+dest);
		engine.stop();
	}

}
