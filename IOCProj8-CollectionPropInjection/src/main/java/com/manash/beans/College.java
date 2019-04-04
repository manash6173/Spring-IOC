package com.manash.beans;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class College {
	private List<String> names;
	private List<Date> dateList;
	private List<?> lists;
	public void setNames(List<String> names) {
		System.out.println(names.getClass());
		this.names = names;
	}
	public void setDateList(List<Date> dateList) {
		System.out.println(dateList.getClass());
		this.dateList = dateList;
	}
	public void setLists(List<?> lists) {
		System.out.println(lists.getClass());
		this.lists = lists;
	}
	/*@Override
	public String toString() {
		return "College [lists=" + lists + "]";
	}*/
	@Override
	public String toString() {
		return "College [names=" + names + ", dateList=" + dateList + "]";
	}
	

}
