package com.manash.test;

public class Demo1 {
	private String name;
	private String addr;
	private Demo1(String name, String addr) {	
		super();
		this.name = name;
		this.addr = addr;
		System.out.println("param constructor");
	}
	public String sayHello(String user) {
		return "Hello "+user;
	}

}
