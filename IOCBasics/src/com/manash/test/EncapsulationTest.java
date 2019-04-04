package com.manash.test;

import java.lang.reflect.Constructor;

class Test {
	private Test() {
		System.out.println("0-param constructor::");
	}
	public void m1() {
		System.out.println("Encapsulation test method m1");
	}
}
 public class EncapsulationTest{
	 public static void main(String[] args)throws Exception {
		 Constructor[] cons=null;
		 //it is not possible to create objects of class outside of the class as the constructors are private
		 //Test t=new Test();
		 //object creation through by using API reflection
		 Class c=Class.forName("com.manash.test.Test");
		 //get available constructor of Test class
		 cons=c.getDeclaredConstructors();
		 System.out.println(cons[0]);
		 cons[0].setAccessible(true);
		 //create object of Test class
		 Test t=(Test)cons[0].newInstance();
		 System.out.println(t);
	}
 }
