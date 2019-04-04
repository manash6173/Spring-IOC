package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.VoterChecking;

public class BeanLifeCycleTestWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		VoterChecking eligibility=null;
		// create IOC container
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
		// get bean class object
		eligibility = factory.getBean("voter", VoterChecking.class);
		System.out.println(eligibility.eligibility());
		factory.destroySingletons();
	}
}
