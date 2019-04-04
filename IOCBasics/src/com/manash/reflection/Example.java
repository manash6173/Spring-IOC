package com.manash.reflection;

public class Example
{
	static int a=10;
	int x;
	public Example(){
	System.out.println("0-param constructor");
	}
	public Example(int x){
	this.x=x;
	System.out.println("1-param constructor");
	}
	static void m1(){
	System.out.println("m1");
	}
	void m2(int i,String s){
	System.out.println("m2 method param values"+i+"  "+s);
	}
}