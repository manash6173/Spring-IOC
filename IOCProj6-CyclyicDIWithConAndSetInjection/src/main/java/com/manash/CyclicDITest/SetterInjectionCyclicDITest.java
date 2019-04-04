package com.manash.CyclicDITest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.A;
import com.manash.beans.B;

public class SetterInjectionCyclicDITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		A a = null;
		B b = null;

		try {
			factory = new DefaultListableBeanFactory();
			reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			// get A class objects from factory
			/*a = factory.getBean("a1", A.class);
			System.out.println(a);*/
			System.out.println("=============");
			b = factory.getBean("b1", B.class);
			System.out.println(b);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
