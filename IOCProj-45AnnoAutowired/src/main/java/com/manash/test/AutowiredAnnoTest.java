package com.manash.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.Student;

public class AutowiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Student student=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");
		//get target class bean object
		student=ctx.getBean("stud",Student.class);
		System.out.println(student);
		//close IOC Container
		((AbstractApplicationContext) ctx).close();
	}
}
