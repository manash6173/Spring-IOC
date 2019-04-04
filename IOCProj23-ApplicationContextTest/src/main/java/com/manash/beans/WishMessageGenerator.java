package com.manash.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessage-0 param Constructor");
		this.date = date;
	}
	public String wishMessage(String user) {
		return date+   ":: Hello "+user;
	}

}
