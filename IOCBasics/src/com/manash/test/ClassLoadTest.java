package com.manash.test;

public class ClassLoadTest {

	public static void main(String[] args)throws Exception {
		Class c=Class.forName("java.util.Date");
		System.out.println("Class object::"+c+" loaded Class Object:: "+c.newInstance());
		System.out.println("================================");
	    String s=new String("ok");
	    Class c1=s.getClass();
	    System.out.println("Class object::"+c1+" loaded Class Object::"+c1.newInstance());
	    System.out.println("================================");
	    Class c2=Integer.class;
	    Class c3=Test1.class;
	    System.out.println("Class object::"+c2+" loaded Class Object::");
	    System.out.println("================================");
	    System.out.println("Class object::"+c3+" loaded Class Object::"+c3.newInstance());
	}

}
