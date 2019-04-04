package com.manash.bo;

import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class EmployeeBO extends BaseBO {
	public EmployeeBO() {
		System.out.println("EmployeeBO::0-param Constructor");
	}
	private String subject;
	@Override
	public String toString() {
		return "EmployeeBO [subject=" + subject + ", getSubject()=" + getSubject() + ", getName()=" + getName()
				+ ", getAddr()=" + getAddr() + ", getDoj()=" + getDoj() + "]";
	}
	
	
}
