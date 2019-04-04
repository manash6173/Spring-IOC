package com.manash.ManagementTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.manash.beans.WishMessage;

public class Test {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		//locate and hold the cnfgs file
		res=new FileSystemResource("src\\com\\manash\\cfgs\\applicationContext.xml");
		//create IOC container
		factory=new XmlBeanFactory(res);
		//get the bean class object
	    java.util.Date date=(java.util.Date)factory.getBean("dt");
	    WishMessage wmg=(WishMessage)factory.getBean("m");
	    System.out.println("Date class objects::"+date);
	    System.out.println("WishMessage class object::"+wmg.sayHello("Raja"));
	    System.out.println("==========================================");
	    WishMessage wmg1=(WishMessage)factory.getBean("m");
	    System.out.println("Date class objects::"+date);
	    System.out.println("WishMessage class object::"+wmg1.sayHello("Rani"));
	    
	}

}
