package com.manash.beans;

import java.util.Date;
import java.util.Map;

public class Faculty {
	private Map<String,String> subjects;
	private Map<String,Date> dates;
	public void setSubjects(Map<String, String> subjects) {
		this.subjects = subjects;
	}
	public void setDates(Map<String, Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "Faculty [subjects=" + subjects + ", dates=" + dates + "]";
	}

}
