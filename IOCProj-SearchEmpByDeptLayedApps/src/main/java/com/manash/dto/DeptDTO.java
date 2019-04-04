package com.manash.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptDTO implements Serializable {
	private int srlNo;
	private int deptNo;
	private String deptName;
	private String loc;
	

}
