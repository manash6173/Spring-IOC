package com.manash.test;

public class Test1 {

	public static void main(String[] args) throws Exception{
		Class c=Class.forName("com.manash.test.Demo");
		Object obj=c.newInstance();
		Demo d=(Demo)obj;
		System.out.println("Demo class Object::"+d.sayHello("  manash"));
		

	}

}
