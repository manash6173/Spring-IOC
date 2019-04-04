package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.Person;

public class DependencyCheckTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Person person1=null;
		try {
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get bean class objects
			person1=factory.getBean("per",Person.class);
			System.out.println(person1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
