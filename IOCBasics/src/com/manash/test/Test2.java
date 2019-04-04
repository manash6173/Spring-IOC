package com.manash.test;

import java.lang.reflect.Constructor;

public class Test2 {

	public static void main(String[] args) throws Exception {
		Class c=Class.forName("com.manash.test.Demo1");
		Constructor cons[]=c.getDeclaredConstructors();
		Object obj=cons[0].newInstance("manash","Hyd");
		Demo1 d1=(Demo1)obj;
		System.out.println("Demo class Object ::"+d1.sayHello("manash"));

	}

}
