package com.manash.beans;

public class MarksList {
	private int mark1;
	public MarksList(int mark1, int mark2) {
		this.mark1 = mark1;
		this.mark2 = mark2;
	}
	private int mark2;
	private int mark3;
	private float avg;
	/*public MarksList(int mark1, int mark2, int mark3, float avg) {
		System.out.println("MarkList Constructor!!");
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.avg = avg;
	}*/
	/*@Override
	public String toString() {
		return "MarksList [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", avg=" + avg + "]";
	}*/
	@Override
	public String toString() {
		return "MarksList [mark1=" + mark1 + ", mark2=" + mark2 + "]";
	}
	

	
	
	
}
