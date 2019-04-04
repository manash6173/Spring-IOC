package com.manas;

public class PetrolEngine implements Engine {
public PetrolEngine() {
	System.out.println("PetrolEngine 0-param Constructor");
}

@Override
public void start() {
	System.out.println("Petrol Engine:Stared");
	
}

@Override
public void stop() {
	System.out.println("Petrol Engine:Stoped");
	
}
}
