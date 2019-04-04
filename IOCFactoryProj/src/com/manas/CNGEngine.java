package com.manas;

public final class CNGEngine implements Engine {
public CNGEngine() {
	System.out.println("CNGEngine 0-param Constructor");
}

@Override
public void start() {
	System.out.println("CNG Engine:Stared");
	
}

@Override
public void stop() {
	System.out.println("CNG Engine:Stoped");
	
}
}
