package com.manash.beans;

public class Person {
	private String pname;
	private int pid;
	private DeviceInfo mobile;
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setMobile(DeviceInfo mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", pid=" + pid + ", mobileNum=" + ", mobile=" + mobile + "]";
	}

}
