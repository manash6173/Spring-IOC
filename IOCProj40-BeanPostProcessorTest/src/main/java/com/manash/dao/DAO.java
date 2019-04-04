package com.manash.dao;

import com.manash.bo.EmployeeBO;
import com.manash.bo.StudentBO;

public interface DAO {
	public void insertEmployee(EmployeeBO ebo);
	public void insertStudent(StudentBO sbo);

}
