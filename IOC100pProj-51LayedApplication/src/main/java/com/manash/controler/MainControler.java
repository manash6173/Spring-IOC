package com.manash.controler;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manash.dto.EmployeeDTO;
import com.manash.service.EmployeeServiceImp;
import com.manash.vo.EmployeeVO;

@Component("controler")
public class MainControler {
	@Resource
	private EmployeeServiceImp service;

	
	public List<EmployeeVO> getEmployeeByDesg(String desg)throws Exception{
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVO> listVO=new ArrayList<EmployeeVO>();
		//invoke foundEmployeeByDesg method
		listDTO=service.foundEmployeeByDesg(desg);
		//copy data from DTO class object to VO class object
		listDTO.forEach(dto->{
			EmployeeVO vo=new EmployeeVO();
			vo.setSrlNo(String.valueOf(dto.getSrlNo()));
			vo.setEmpNo(String.valueOf(dto.getEmpNo()));
			vo.setEmpName(dto.getEmpName());
			vo.setDesg(dto.getDesg());
			vo.setSalary(String.valueOf(dto.getSalary()));
			listVO.add(vo);
		});
		return listVO;
			
	}

}
