package com.manash.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.ScheduleRemainder;

public class BeanFactoryTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleRemainder reminder=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get bean class object
		reminder=ctx.getBean("reminder",ScheduleRemainder.class);
		System.out.println("Todays Plan::"+reminder.remindPlan(new Date()));
		//close container
         ((AbstractApplicationContext) ctx).close();
	}

}
