package com.manash.controler;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.manash.bo.EmployeeBO;
import com.manash.dto.EmployeeDTO;
import com.manash.service.EmployeeServiceImp;
import com.manash.vo.EmployeeVO;

public class EmployeeControler {
	private EmployeeServiceImp empservice;

	public void setEmpservice(EmployeeServiceImp empservice) {
		this.empservice = empservice;
	}
	public List<EmployeeVO> foundEmployee(String desg) throws SQLException{
		
	         List<EmployeeVO> listVO=new ArrayList();
	         List<EmployeeDTO> empdto=empservice.findDesg(desg);
	         
	         Iterator<?> it=empdto.iterator();
	 		while(it.hasNext()) {
	 			EmployeeDTO empdto1=(EmployeeDTO) it.next();
	 			EmployeeVO empvo=new EmployeeVO();
	 			empvo.setEname(empdto1.getEname());
	 			empvo.setDesg(empdto1.getDesg());
	 			empvo.setSalary(empdto1.getSalary());
	 			listVO.add(empvo);
	 		}
	         return listVO; 
	}
}
