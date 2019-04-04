package com.manash.beans;

public class ProffessonalCricketer {
	private String name;
	private Bat bat;
	private ProffessonalCricketer(String name, Bat bat) {
		this.name = name;
		this.bat = bat;
	}
	public String scored() {
		int score=new Bat().batting();
		return name+" has Scored "+ score+" run";
	}
}
