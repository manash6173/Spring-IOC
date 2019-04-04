package com.manash.bo;


import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
public class StudentBO extends BaseBO {
	public StudentBO() {
		System.out.println("StudentBO::0-param constructor");
	}
	private String course;
	@Override
	public String toString() {
		return "StudentBO [course=" + course + ", getCourse()=" + getCourse() + ", getName()=" + getName()
				+ ", getAddr()=" + getAddr() + ", getDoj()=" + getDoj() + "]";
	}
	
}
