package com.manash.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.core.style.DefaultToStringStyler;

import com.manash.dto.DeptDTO;
import com.manash.service.DeptService;
import com.manash.vo.DeptVO;

public class MainControler {
	private DeptService service;
	public MainControler(DeptService service) {
		this.service = service;
	}
	public List<DeptVO> getByDeptNo(int deptno)throws Exception{
		List<DeptVO> listVO=new ArrayList<DeptVO>();
		List<DeptDTO> listDTO=null;
		//invoke Service class method
		listDTO=service.foundByDeptNo(deptno);
		listDTO.forEach(dto->{
			DeptVO vo=new DeptVO();
			BeanUtils.copyProperties(dto,vo);
			vo.setDeptNO(String.valueOf(dto.getDeptNo()));
			vo.setDeptName(dto.getDeptName());
			vo.setLoc(dto.getLoc());
			vo.setSrlNo(String.valueOf(dto.getSrlNo()));
			listVO.add(vo);
		});
		return listVO;
	}
}
