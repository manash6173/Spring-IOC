package com.manash.service;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manash.bo.EmployeeBO;
import com.manash.dao.EmployeeDAOImp;
import com.manash.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImp implements EmployeeService {
	@Resource
	private EmployeeDAOImp dao;
	
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
