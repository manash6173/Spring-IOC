package com.manash.service;

import com.manash.bo.StudentBO;
import com.manash.dao.StudentDAO;
import com.manash.dto.StudentDTO;

public class StudentServiceImp implements StudentService {
	private StudentDAO dao;
	public StudentServiceImp(StudentDAO dao) {
		super();
		this.dao = dao;
	}
	public String evaluate(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;		 
		//create business logics
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3;
		if(dto.getM1()<35 || dto.getM2()<35 || dto.getM3()<35)
			result="FAIL";
		else
			result="PASS";
			 StudentBO bo=new StudentBO();
			  bo.setSname(dto.getSname());
			  bo.setTotal(total);
			  bo.setAvg(avg);
			  bo.setResult(result);
		 int cnt=dao.studentInsert(bo);
		  if(cnt==0) {
			  return "Result:"+bo.getResult()+"  "+"Registration Failed";
	}
		  else
			  return "Result:"+bo.getResult()+"   "+"Registration Succedded";
     
	}
}
