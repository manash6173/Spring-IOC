package com.manas;

public class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle:0-param Constructor");
	}
	public void journey(String from,String to) {
		System.out.println("journey start::"+from);
		System.out.println("journey dest::"+to);
	}

}
