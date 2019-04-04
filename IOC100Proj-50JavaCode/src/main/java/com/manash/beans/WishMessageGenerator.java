package com.manash.beans;

import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("wmg")

public class WishMessageGenerator {
	@Resource
	private Date date;
	public WishMessageGenerator() {
	System.out.println("WishMessageGenerator::0-param constructor");
	}
	public String wishMessage(String user) {
		int hour=0;
		hour=date.getHours();
	  if(hour<12)
		  return "Good Morning "+user;
	  else if(hour<16)
		  return "Good AfterNoon "+user;
	  else if(hour<18)
		  return "Good Evening "+user;
	  else  
		  return "Good Night "+user;
	}
}
