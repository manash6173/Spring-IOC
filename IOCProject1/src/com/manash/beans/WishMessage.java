package com.manash.beans;

public class WishMessage {
	public WishMessage() {
		System.out.println("WishMessage o-param constructor");
	}
	public String sayHello(String user) {
		return "Good Morning  "+user;
	}
}
