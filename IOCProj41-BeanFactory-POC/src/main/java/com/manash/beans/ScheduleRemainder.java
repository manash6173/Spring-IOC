package com.manash.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date reminder;

	public ScheduleRemainder(Date reminder) {
		System.out.println("ScheduleRemainder.ScheduleRemainder()");
		this.reminder = reminder;
	}
	public String remindPlan(Date date) {
		if (date.getYear()==reminder.getYear() && date.getMonth()==reminder.getMonth() && date.getDate()==reminder.getDate()) {
			return "weak up early..some important works are there!!";
		}
		return "No plan today";
	}
}
