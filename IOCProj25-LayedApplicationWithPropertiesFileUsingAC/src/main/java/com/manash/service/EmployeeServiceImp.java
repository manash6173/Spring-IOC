package com.manash.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.manash.bo.EmployeeBO;
import com.manash.dao.EmployeeDAOImp;
import com.manash.dto.EmployeeDTO;

public class EmployeeServiceImp implements EmployeeService {
	private EmployeeDAOImp dao;
	public EmployeeServiceImp(EmployeeDAOImp dao) {
		this.dao = dao;
	}
	public List<EmployeeDTO> foundEmployeeByDesg(String desg) throws Exception {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList<EmployeeDTO>();
		//invoke dao class method
		listBO=dao.searchEmployeeByDesg(desg);
		//copy bo class object data to dto class object
		listBO.forEach(bo->{ 
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrlNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}
}
