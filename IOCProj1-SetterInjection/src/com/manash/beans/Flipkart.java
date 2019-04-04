package com.manash.beans;

import java.lang.reflect.Array;

public class Flipkart {
	private DTDC dtdc;
	public void setDtdc(DTDC dtdc) {
		this.dtdc = dtdc;
	}
	

	public  String purches(int args) {
		int billamt=0;
		billamt=args*1000;
		System.out.println("total Price"+billamt);
		System.out.println(dtdc.delivery(100));
		return "bill amount"+billamt;
		
	}

}
