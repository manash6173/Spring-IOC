package com.manash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.manash.beans.WishMessage;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessage wm=null;
		//locate and hold the xml file
		res=new FileSystemResource("src/com/manash/cfgs/applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get bean class object
		wm=(WishMessage)factory.getBean("m");
		System.out.println("WishMessage object::"+wm.sayHello("manash"));
	}

}
