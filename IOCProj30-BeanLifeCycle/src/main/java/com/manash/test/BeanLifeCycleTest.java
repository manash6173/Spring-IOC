package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.VoterChecking;

public class BeanLifeCycleTest {
 
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		VoterChecking eligibility=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		eligibility=ctx.getBean("voter",VoterChecking.class);
		System.out.println(eligibility.eligibility());
		((AbstractApplicationContext) ctx).close();
	}
}
