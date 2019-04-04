package com.manash.service;

import com.manash.bo.RateOfInterestBO;
import com.manash.dao.RateOfInterestDAO;
import com.manash.dao.RateOfInterestDAOImp;
import com.manash.dto.RateOfInterestDTO;

public class RateOfInterestServiceImp implements RateOfInterestService {
	private RateOfInterestDAO dao;

	public void setDao(RateOfInterestDAOImp dao) {
		this.dao = dao;
	}

	@Override
	public String evaluate(RateOfInterestDTO dto) throws Exception {
		RateOfInterestBO bo=null;
		double si=0.0;
		double rate=0.0;
		double ci=0.0;
		int result=0;
		//calculate interest rate
		si=dto.getPrincipal()+((dto.getPrincipal()*dto.getRate()*dto.getTime())/100);
		rate=(1+dto.getRate()/100);
		rate=Math.pow(rate, dto.getTime());
		ci=dto.getPrincipal()*rate;
		////create BO class object
		bo=new RateOfInterestBO();
		//set values in bo class objects
		bo.setPrincipal(dto.getPrincipal());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setSi(si);
		bo.setCi(ci);
		result=dao.insertLoan(bo);
		if(result==1) {
			return "Your SimpleInterest is ::"+si+ "\n Compound Interest is ::"+ci +" \n stored Successful";
		}
		else {
			return "Interest amount not found";
		}
	}

}












