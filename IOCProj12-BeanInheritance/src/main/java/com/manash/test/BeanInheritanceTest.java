package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.Car;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Car car1=null,car2=null,car3=null;
		try {
			//create IOC container
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get target class object
			car1=factory.getBean("car1",Car.class);
			System.out.println(car1);
		    System.out.println("=================================");
		    car2=factory.getBean("baseCar",Car.class);
		    System.out.println(car2);
			/*System.out.println("===============================");
			car2=factory.getBean("car2",Car.class);
			System.out.println(car2);
			System.out.println("===============================");
			car3=factory.getBean("car3",Car.class);
			System.out.println(car3);*/
		}catch(Exception e) {
			e.printStackTrace();
		}

	}//main
}//class











