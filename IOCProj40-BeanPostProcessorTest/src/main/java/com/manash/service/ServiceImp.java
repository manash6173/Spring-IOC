package com.manash.service;

import com.manash.bo.EmployeeBO;
import com.manash.bo.StudentBO;
import com.manash.dao.DAO;

public abstract class ServiceImp implements Service {
	private DAO dao;
	public abstract EmployeeBO createEmployee();
	public abstract StudentBO createStudent();
	public ServiceImp() {
      System.out.println("ServiceImp::0-param constructor");
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public void registerEmployee(String name, String addr, String subject) {
		//get EmployeetBO object
		EmployeeBO ebo=createEmployee();
		//set values in EmployeeBO
		ebo.setName(name);
		ebo.setAddr(addr);
		ebo.setSubject(subject);
		dao.insertEmployee(ebo);
	}
	public void registerStudent(String name, String addr, String course) {
		//get StudentBO Object
		StudentBO sbo=createStudent();
		//set values in StudentBo
		sbo.setName(name);
		sbo.setAddr(addr);
		sbo.setCourse(course);
		dao.insertStudent(sbo);
	}
	@Override
	public String toString() {
		return "ServiceImp [dao=" + dao + ", createEmployee()=" + createEmployee() + ", createStudent()="
				+ createStudent() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
