package com.manash.beans;

public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("PetrolEngine Started");
		System.out.println("======================");
		
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine Stoped");
		System.out.println("======================");
		
	}
	

}
