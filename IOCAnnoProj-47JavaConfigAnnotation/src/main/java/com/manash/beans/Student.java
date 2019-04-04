package com.manash.beans;

import javax.inject.Inject;
import javax.inject.Named;

@Named("stud")
public class Student {
	/*@Inject 
	@Named("jm")*/
	private CourseMaterial material;
	@Inject 
	@Named("jm")
		public void setMaterial(CourseMaterial material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Student [material=" + material + "]";
	}
}
