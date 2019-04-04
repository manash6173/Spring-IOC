package com.manash.ManagementTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.manash.beans.Vehicle;

public class AppTest {

	public static void main(String[] args) {
		Vehicle vehicle=null;
		BeanFactory factory=null;
		factory= new XmlBeanFactory(new ClassPathResource("com/manash/cfgs/applicationContext.xml"));
        vehicle=(Vehicle)factory.getBean("vehicle");
        System.out.println(vehicle.journey("mumbai","delhi"));
	}

}
