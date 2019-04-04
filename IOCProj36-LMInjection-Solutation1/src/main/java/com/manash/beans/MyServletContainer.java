package com.manash.beans;

public class MyServletContainer {
	private RequestHandler handler;
	public MyServletContainer() {
		System.out.println("MyServletContainer::o-param Constructor");
	}

	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	public void processRequest(String data) {
		handler.handler(data);
	}
	
	
}
