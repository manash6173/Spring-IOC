package com.manash.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

@Named("wmg")
public class WishMessageGenerator {
	private Date date;
    
	@PostConstruct
    public void myInit() {
    	System.out.println("WishMessageGenerator.myInit()");
    	date=new Date();
    }
    
    public String wishMessage(String user) {
    	int hour=0;
    	hour=date.getHours();
    	if(hour<12)
    		return "Good Morning"+user;
    	else if(hour<16)
    		return "Good AfterNoon"+user;
    	else if(hour<20)
    		return "Good Evening"+user;
    	else
    		return "Good Night"+user;
    }
    @PreDestroy
    public void myDestory() {
    	System.out.println("WishMessageGenerator.myDestory()");
    	date=null;
    }


}
