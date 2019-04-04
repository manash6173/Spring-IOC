package com.manash.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manash.beans.VoterChecking;

public class TestBeanLifeCycle {
	private static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/manash/cfgs/applicationContext.xml");	
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}

	@Test
	public void testWithInvalidAge() {
		String actualResult=null;
		String exceptedResult=null;
		VoterChecking eligibility=null;
		eligibility=ctx.getBean("voter1",VoterChecking.class);
		exceptedResult=eligibility.eligibility();
		actualResult="Mr./Miss raja You are not eligibility for vote checking on ";
		assertTrue("result1",exceptedResult.contains(actualResult));
	}
	@Test
	public void testWithValidAge() {
		String actualResult=null;
		String exceptedResult=null;
		VoterChecking eligibility=null;
		eligibility=ctx.getBean("voter2",VoterChecking.class);
		exceptedResult=eligibility.eligibility();
		actualResult="Mr./Miss/Mrs. raja You are eligibility for vote checking on ";
		assertTrue("result1",exceptedResult.contains(actualResult));
	}
	@Test(expected=Exception.class)
	public void testWithNegativeAge() {
		VoterChecking eligibility=null;
		eligibility=ctx.getBean("voter3",VoterChecking.class);
		fail("Exception excepted but still executed");
	}
	@Test(expected=Exception.class)
	public void testWithNoAge() {
		VoterChecking eligibility=null;
		eligibility=ctx.getBean("voter3",VoterChecking.class);
		fail("Exception excepted but still executed");
	}

}
