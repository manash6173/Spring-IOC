package com.manash.beans;

import java.util.Random;

public class Bat {
	private String make;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	public int batting() {
		return new Random().nextInt(200);
	}
	

}
