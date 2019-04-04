package com.manash.service;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class BankServiceReplacer implements MethodReplacer{
	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		float amt=0.0f,time=0.0f;
		//get values 
		amt=(Float)args[0];
		time=(Float)args[1];
		return (amt*time*rate)/100.0f;
	}
}
