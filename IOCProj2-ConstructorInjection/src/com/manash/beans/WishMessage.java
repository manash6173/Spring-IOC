package com.manash.beans;

import java.util.Date;

public class WishMessage {
	private Date date=null;

	public WishMessage(Date date) {
		super();
		this.date = date;
	}
	public String sayHello(String user) {
		int hour=0;
		hour=date.getHours();
				if(hour<=11)
					return "Good Morning "+user;
				else if(hour<=16)
					return "Good AfterNoon "+user;
				else if(hour<=21)
					return "Good Evening "+user;
				else
					return "Good Night "+user;
	}

}
