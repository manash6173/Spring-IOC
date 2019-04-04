package com.manash.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args)throws Exception {
		Class cls=Class.forName("com.manash.reflection.Example");
		int p=0;
		Method mth=null;
		System.out.println(cls);
		System.out.println(cls.getPackage());
		System.out.println(cls.getModifiers());
		System.out.println(cls.getName());
		System.out.println(cls.getSuperclass());
		System.out.println(cls.getInterfaces());
	}
}
