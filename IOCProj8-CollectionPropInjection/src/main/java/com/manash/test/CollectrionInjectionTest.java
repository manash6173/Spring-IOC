package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.College;
import com.manash.beans.Faculty;
import com.manash.beans.FruitColors;
import com.manash.beans.Student;
import com.manash.beans.University;

public class CollectrionInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student stud=null;
		College colg=null;
		University unvs=null;
		Faculty fact=null;
		FruitColors fruits=null;
		
		
		try {
			//create IOC container
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get student class objects
			stud=factory.getBean("stud",Student.class);
			System.out.println(stud);
			System.out.println("====================");
			//get College class objects injected with List collection 
			colg=factory.getBean("colg",College.class);
			System.out.println(colg);
			System.out.println("=====================");
			//get University class objects injected with Set collection
			unvs=factory.getBean("unvs",University.class);
			System.out.println(unvs);
			System.out.println("======================");
			//get Faculty class objects injected with Map collection
			fact=factory.getBean("fact",Faculty.class);
			System.out.println(fact);
			//get FruitColor class objects injected with Properties collection
			System.out.println("======================");
			fruits=factory.getBean("fruit",FruitColors.class);
			System.out.println(fruits);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
