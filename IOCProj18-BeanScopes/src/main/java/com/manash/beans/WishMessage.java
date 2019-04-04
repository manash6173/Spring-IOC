package com.manash.beans;

import java.util.Date;

public class WishMessage {
	private  static WishMessage instance;
	public WishMessage() {
		System.out.println("WishMEssage:0-param Constructor");
	}

	public static WishMessage getInstance() {
		if(instance==null)
			instance=new WishMessage();
		return instance;
	}
}
