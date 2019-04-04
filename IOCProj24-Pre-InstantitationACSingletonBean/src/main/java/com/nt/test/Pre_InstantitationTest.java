package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.manash.beans.Flipkart;

public class Pre_InstantitationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get Target class object injecting with Dependent class object
		//fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke b.method
		//System.out.println(fpkt.shopping(new String[] {"long kurta","dandiya sticks","rold gold ","kolhapuri"}));
       //close IOC container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
