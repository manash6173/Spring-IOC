package com.manash.dao;

import com.manash.bo.EmployeeBO;
import com.manash.bo.StudentBO;

public class DAOImp implements DAO {
	public DAOImp() {
		System.out.println("DAOImp::0-param constructor");
	}
	public void insertEmployee(EmployeeBO ebo) {
		System.out.println("DAOImp.registerEmployee()");
		System.out.println(ebo.toString());
	}
	public void insertStudent(StudentBO sbo) {
		System.out.println("DAOImp.registerStudent()");
		System.out.println(sbo.toString());
	}
    
}
