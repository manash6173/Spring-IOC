package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.BankAccount;
import com.manash.beans.MarksList;
import com.manash.beans.StudentTest1;

public class ConstructorInjectedTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		StudentTest1 stud=null;
		MarksList mark=null;
		BankAccount account=null;
	
		try {
			//create IOC container
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/ApplicationContext.xml");
			//get Student class objects
			stud=factory.getBean("stud",StudentTest1.class);
			System.out.println(stud);
			System.out.println("=================");
			//get MArkList objects
			mark=factory.getBean("mark",MarksList.class);
			System.out.println(mark);
			System.out.println("==================");
			//get BankAccount class objects
			account=factory.getBean("bAccount",BankAccount.class);
			System.out.println(account);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
