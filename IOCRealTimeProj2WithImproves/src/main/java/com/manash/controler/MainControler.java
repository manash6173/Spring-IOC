package com.manash.controler;

import com.manash.dto.StudentDTO;
import com.manash.service.StudentService;
import com.manash.vo.StudentVO;

public class MainControler {
	private StudentService service;

	public void setService(StudentService service) {
		this.service = service;
	}
	public String generateResult(StudentVO vo)throws Exception {
		String result=null;
		//convert VO class objects to DTO class objects
		StudentDTO dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		result=service.evaluate(dto);
		return result;
	}
	

}
