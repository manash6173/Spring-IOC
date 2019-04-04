package com.manash.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDTO implements Serializable{
	private int empNo;
	private String empName;
	private String desg;
	private int salary;
	private int srlNo;
}
