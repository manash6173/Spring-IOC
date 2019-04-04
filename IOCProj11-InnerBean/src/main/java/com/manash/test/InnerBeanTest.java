package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.ProffessonalCricketer;

public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ProffessonalCricketer cricketer1=null,cricketer2,cricketer3;
		
		try {
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get Target class objet from bean factory
			cricketer1=factory.getBean("kohli",ProffessonalCricketer.class);
			System.out.println(cricketer1.scored());
			System.out.println("==================================");
			cricketer2=factory.getBean("dhoni",ProffessonalCricketer.class);
			System.out.println(cricketer2.scored());
			System.out.println("====================================");
			cricketer3=factory.getBean("com.manash.beans.ProffessonalCricketer",ProffessonalCricketer.class);
			System.out.println(cricketer3.scored());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
