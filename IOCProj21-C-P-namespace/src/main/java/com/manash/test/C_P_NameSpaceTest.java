package com.manash.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.manash.beans.EmployeeDetails;

public class C_P_NameSpaceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EmployeeDetails empDetails=null;
		try {
			factory=new DefaultListableBeanFactory();
			reader=new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/manash/cfgs/applicationContext.xml");
			//get target class object 
			empDetails=factory.getBean("emp",EmployeeDetails.class);
			System.out.println(empDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
