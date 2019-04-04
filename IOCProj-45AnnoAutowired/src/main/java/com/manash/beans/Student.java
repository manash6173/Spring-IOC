package com.manash.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

//import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	/*@Autowired
	@Qualifier("java")*/
	private CourseMaterial material;
    
	@Autowired(required=true)
	public Student(CourseMaterial material) {
		this.material = material;
		System.out.println("Student.Student()");
	}
	@Autowired(required=true)
	public void setMaterial(CourseMaterial material) {
		this.material = material;
		System.out.println("Student.setMaterial()");
	}
	@Autowired(required=true)
	public void assign(CourseMaterial material) {
		this.material=material;
		System.out.println("Student.assign()");
	}
	@Override
	public String toString() {
		return "Student [material=" + material + "]";
	}
}
