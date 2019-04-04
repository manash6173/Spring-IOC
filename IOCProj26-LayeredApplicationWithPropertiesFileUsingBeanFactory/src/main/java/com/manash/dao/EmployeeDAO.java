package com.manash.dao;

import java.util.List;

import com.manash.bo.EmployeeBO;

public interface EmployeeDAO {
	public List<EmployeeBO> searchEmployeeByDesg(String desg)throws Exception;

}
