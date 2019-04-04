package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.WishMessage;

public class BeanScopesTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		WishMessage message1=null,message2=null;
		try {
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get bean class object
			message1=factory.getBean("m",WishMessage.class);
			message2=factory.getBean("m",WishMessage.class);
			System.out.println(message1.hashCode()+"   "+message2.hashCode());
			System.out.println("message1==message2?"+(message1==message2));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
