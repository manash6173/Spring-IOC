package com.manash.beans;

import org.springframework.stereotype.Component;

@Component("rHandler")
public class RequestHandler {
	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:0-paramConstructor");
	}
	public void handler(String data) {
		System.out.println("Handling Request::"+count+"\n With date "+data);
	}
}
