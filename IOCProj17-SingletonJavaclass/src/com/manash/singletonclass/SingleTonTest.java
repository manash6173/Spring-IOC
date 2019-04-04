package com.manash.singletonclass;

 /*class Math{
	private Math() {
		System.out.println("Math 0-param constructor");
	}
	public static Math add(int a,int b) {
		Math m=new Math();
		System.out.println(m.hashCode());
		return m;
	}

}
//problem code
public class SingleTonTest{
	public static void main(String[] args) {
		//create object for math class
		Math m1=Math.add(20,30);
		System.out.println("===============");
		Math m2=Math.add(40,30);
		System.out.println("m1=m2"+(m1==m2));
	}
	
}*/
class Arithmetic{
	private static final float PI=3.14f;
	public static float findArea(int radious) {
		return PI*radious*radious;
	}
}
public class SingleTonTest{
	public static void main(String[] args) {
		//create object for math class
		Arithmetic ar=new Arithmetic();
		float area=ar.findArea(10);
		System.out.println(ar.hashCode());
		Arithmetic ar1=new Arithmetic();
		float area1=ar1.findArea(20);
		System.out.println(ar1.hashCode());
		System.out.println("ar1==ar2:::"+(ar==ar1));
	}
	}








