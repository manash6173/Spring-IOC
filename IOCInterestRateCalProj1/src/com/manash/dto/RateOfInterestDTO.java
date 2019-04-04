package com.manash.dto;

import java.io.Serializable;

public class RateOfInterestDTO implements Serializable {
	private double principal;
	private float rate;
	private float time;
	public double getPrincipal() {
		return principal;
	}
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}

}
