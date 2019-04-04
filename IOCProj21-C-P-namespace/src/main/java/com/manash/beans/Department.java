package com.manash.beans;

import java.util.Date;

public class Department {
	private String dno;
	private String dname;
	private Date dos;
	
	public Department(String dno, String dname, Date dos) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dos = dos;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", dos=" + dos + "]";
	}
	

}
