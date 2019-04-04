package com.manash.bo;

import java.util.Date;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public abstract class BaseBO {
	private String name;
	private String addr;
	private Date doj;
}