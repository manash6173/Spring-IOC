package com.manash.controler;

import com.manash.dto.RateOfInterestDTO;
import com.manash.service.RateOfInterestService;
import com.manash.vo.RateOfInterestVO;

public class MainControler {
	private RateOfInterestService service;
	public void setService(RateOfInterestService service) {
		this.service = service;
	}
	public String interestAmount(RateOfInterestVO vo)throws Exception{
		String totalAmt=null;
		//convert vo class objects to DTO class objects
		RateOfInterestDTO dto=new RateOfInterestDTO();
		dto.setPrincipal(Double.parseDouble(vo.getPrincipal()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//calculate loan amount
		totalAmt=service.evaluate(dto);
		return totalAmt;
	}
}
