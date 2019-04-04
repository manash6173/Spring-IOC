package com.manash.beans;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterChecking implements InitializingBean ,DisposableBean {
	private String name;
	private int age;
	private String addr;
	private Date checkingDate;
	public void setName(String name) {
		System.out.println("VoterChecking.setName()");
		this.name = name;
	}
	public void setAge(int age) {
         System.out.println("VoterChecking.setAge()");
		this.age = age;
	}
	public void setAddr(String addr) {
		System.out.println("VoterChecking.setAddr()");
		this.addr = addr;
		
	}
	public void myInit() {
		System.out.println("VoterChecking.myInit()");
		//injecting important properties of bean
		checkingDate=new Date();
		//checking proper value injected or not
		if(name==null || addr==null) {
			throw new IllegalArgumentException("Name and age is mandatory");
		}
		if(age<=0) {
			throw new IllegalArgumentException("Invalid Age::Age must be positive number");
		}
	}
	public String eligibility() {
		System.out.println("VoterChecking.eligibility()");
		if(age<18) {
			return "Mr./Miss "+name+" You are not eligibility for vote checking on "+checkingDate;
		}
		return "Mr./Miss/Mrs. "+name+" You are eligibility for vote checking on "+checkingDate;
	}
	public void myDestroy() {
		System.out.println("VoterChecking.myDestroy()");
		//Nullify all values 
		name=null;age=0;addr=null;checkingDate=null;
	}
	public void destroy() throws Exception {
		System.out.println("VoterChecking.destroy()");
		//Nullify all values 
		name=null;age=0;addr=null;checkingDate=null;
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterChecking.afterPropertiesSet()");
		//injecting important properties of bean
		checkingDate=new Date();
		//checking proper value injected or not
		if(name==null || addr==null) {
			throw new IllegalArgumentException("Name and age is mandatory");
		}
		if(age<=0) {
			throw new IllegalArgumentException("Invalid Age::Age must be positive number");
		}
	}
}
