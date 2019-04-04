package com.manash.singletonclass;

class Math1 {
	private static Math1 instance;
	private Math1() {
		System.out.println("0-param constructor");
	}
	//static method
	public static Math1 add(int a,int b) {
		if(instance==null)
			instance=new Math1();
		return instance;
		
	}
}
public class SingleTonTestSol{
	public static void main(String[] args) {
		Math1 m1=Math1.add(10, 20);
		Math1 m2=Math1.add(20, 50);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println("================");
		System.out.println("m1=m2 ?"+(m1==m2));
	}
	
}
