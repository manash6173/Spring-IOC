package com.manash.beans;

public class DeviceInfo {
	private String make;
	private long number;
	private int iemi;
	public void setMake(String make) {
		this.make = make;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setIemi(int iemi) {
		this.iemi = iemi;
	}
	@Override
	public String toString() {
		return "DeviceInfo [make=" + make + ", number=" + number + ", iemi=" + iemi + "]";
	}

}
