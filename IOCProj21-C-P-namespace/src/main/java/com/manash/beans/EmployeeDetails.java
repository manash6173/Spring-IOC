package com.manash.beans;


public class EmployeeDetails {
	private String ename;
	private int eid;
	private Department dept;
	private Class clazz;
	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [ename=" + ename + ", eid=" + eid + ", dept=" + dept + ", clazz=" + clazz + "]";
	}

}
