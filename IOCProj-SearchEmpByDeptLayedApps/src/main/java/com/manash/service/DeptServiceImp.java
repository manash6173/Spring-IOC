package com.manash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.manash.bo.DeptBO;
import com.manash.dao.DeptDAO;
import com.manash.dto.DeptDTO;

public class DeptServiceImp implements DeptService {
	private DeptDAO dao;

	public DeptServiceImp(DeptDAO dao) {
		this.dao = dao;
	}

	public List<DeptDTO> foundByDeptNo(int deptno) throws Exception {
		List<DeptDTO> listDTO=new ArrayList<DeptDTO>();
		List<DeptBO> listBO=null;
		//invoke DAO method
		listBO=dao.searchByDeptNo(deptno);
		listBO.forEach(bo->{
			DeptDTO dto=new DeptDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrlNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
