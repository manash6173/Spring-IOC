package com.manash.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		Class c1 = null;
		Calendar cl = null;
		String s2 = null;
		StringBuffer s3=null;
		try {
			// create IOC container
			factory = new DefaultListableBeanFactory();
			reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			// get bean class object from static factory method by returning its own class object
			c1 = factory.getBean("c1", Class.class);
			System.out.println("c1 class type is:" + c1.getClass() + " object data is:" + c1);
			System.out.println("=======================================================");
			// get bean class object from static factory method by returning its related class object
			cl = factory.getBean("cl", Calendar.class);
			System.out.println("cl class name is:" + cl.getClass() + " object data is" + cl);
			System.out.println("=======================================================");
			// get bean class object from instatce factory method by returning its own class object
			s2 = factory.getBean("s2", String.class);
			System.out.println("s2 class name is:" + s2.getClass() + "  object data is: " + s2);
			//get bean class objects from instance factory method by returning related class objects
			System.out.println("=======================================================");
			s3=factory.getBean("s3",StringBuffer.class);
			System.out.println("s3 class name is:" + s3.getClass() + "  object data is: " + s3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
