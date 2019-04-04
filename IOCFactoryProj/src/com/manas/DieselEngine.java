package com.manas;

public class DieselEngine implements Engine {
public DieselEngine() {
	System.out.println("DieselEngine 0-param Constructor");
}

@Override
public void start() {
	System.out.println("Diesel Engine:Stared");
	
}

@Override
public void stop() {
	System.out.println("Diesel Engine:Stoped");
	
}
}
