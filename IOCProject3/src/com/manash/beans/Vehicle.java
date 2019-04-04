package com.manash.beans;

public class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle:0-param constructor!!!!");
	}
	private Engine engine;
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String journey(String fr,String to) {
		engine.start();
		System.out.println("journey starts from "+fr);
		System.out.println("");
		System.out.println("vehicle is moving=>=>=>=>=>>>>>");
		System.out.println("");
		System.out.println("journey Ends at "+to);
		System.out.println("");
		engine.stop();
		return "journey End";
	}

}
