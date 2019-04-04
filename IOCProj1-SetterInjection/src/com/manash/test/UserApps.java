package com.manash.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.manash.beans.Flipkart;

public class UserApps {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		res=new ClassPathResource("com/manash/cfgs/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		Flipkart flp=(Flipkart)factory.getBean("flkt");
		System.out.println("billmsg"+flp.purches(4));
	}

}
