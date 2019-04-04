package com.manash.beans;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private CourseMaterial material;

	public CourseMaterial getMaterial() {
		return material;
	}
     @Required
	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Student [material=" + material + "]";
	}
}
