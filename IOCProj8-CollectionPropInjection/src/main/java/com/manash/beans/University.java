package com.manash.beans;

import java.util.Date;
import java.util.Set;

public class University {
	private Set<String> phoneNumber;
	private Set<Date> dates;
	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
		System.out.println(phoneNumber.getClass());
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
		System.out.println(dates.getClass());
	}
	@Override
	public String toString() {
		return "University [phoneNumber=" + phoneNumber + ", dates=" + dates + "]";
	}

}
