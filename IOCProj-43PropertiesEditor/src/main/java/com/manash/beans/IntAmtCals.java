package com.manash.beans;



public class IntAmtCals {
	private IntrestAmtDetails details;
	
	public void setDetails(IntrestAmtDetails details) {
		this.details = details;
	}

	public float calcAmt() {
		return (details.getAmt()*details.getTime()*details.getRate())/100.0f;
	}

}
