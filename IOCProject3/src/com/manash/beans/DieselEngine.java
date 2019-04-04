package com.manash.beans;

public final class DieselEngine implements Engine {
	public DieselEngine() {
		System.out.println("DieselEngine:0-param constructor");
	}

	@Override
	public void start() {
		System.out.println("DieselEngine Started");
		System.out.println("======================");
		
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine Stoped");
		System.out.println("======================");
		
	}

}
