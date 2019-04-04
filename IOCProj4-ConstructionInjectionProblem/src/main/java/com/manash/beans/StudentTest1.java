package com.manash.beans;

public class StudentTest1 {
	private int sno;
	private String sname;
	private String addr;
	private String course;
	private float fees;
	public StudentTest1(int sno, String sname, String addr, String course, float fees) {
		System.out.println("Student constructor!!!");
		this.sno = sno;
		this.sname = sname;
		this.addr = addr;
		this.course = course;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "StudentTest1 [sno=" + sno + ", sname=" + sname + ", addr=" + addr + ", course=" + course + ", fees="
				+ fees + "]";
	}
	

}
