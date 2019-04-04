package com.manash.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;

import com.manash.bo.EmployeeBO;
import com.manash.dao.EmployeeDAO;
import com.manash.dto.EmployeeDTO;
import com.sun.org.apache.bcel.internal.generic.IRETURN;

public class EmployeeServiceImp {
	private EmployeeDAO dao;
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	public List<EmployeeDTO> findDesg(String desg) throws SQLException{
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		List<EmployeeBO> empbo=dao.searchDesg(desg);
		EmployeeBO empbo1=new EmployeeBO();
		Iterator<?> it=empbo.iterator();
		while(it.hasNext()) {
			 empbo1=(EmployeeBO) it.next();
			 EmployeeDTO empdto=new EmployeeDTO();
			 empdto.setEname(empbo1.getEname());
			 empdto.setDesg(empbo1.getDesg());
			 empdto.setSalary(empbo1.getSalary());
			 listDTO.add(empdto);
		}
       return listDTO;
	}

}
