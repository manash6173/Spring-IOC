package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.Vehicle;

public class DependebcyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Vehicle vehicle=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
		//get target class object
		vehicle=factory.getBean("vehicle",Vehicle.class);
		//System.out.println(vehicle);
		vehicle.journey("hyd","vizag");
		vehicle.entertainment();
		vehicle.soundHorn();
		
	}

}
