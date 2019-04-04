package com.manash.beans;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component("stud")
public class Student {
	 @Autowired
	private CourseMaterial material;
		public void setMaterial(CourseMaterial material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Student [material=" + material + "]";
	}
}
