package com.manash.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class MyServletContainer {
	@Lookup
	public abstract RequestHandler createRequestHandler();
	
	public MyServletContainer() {
		System.out.println("MyServletContainer::o-param Constructor");
	}
	public void processRequest(String data) {
		RequestHandler handler=null;
		handler=createRequestHandler();
		handler.handler(data);
	}
}
