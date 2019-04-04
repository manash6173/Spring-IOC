package com.manash.beans;

public class Car {
	private String regID;
	private String ownerName;
	private String make;
	private String model;
	private int engineCC;
	private String fuelType;
	private String seatNo;
	private String color;
	private int price;
	public void setRegID(String regID) {
		this.regID = regID;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car[regID=" + regID + "\n ownerName=" + ownerName + "\n make=" + make + "\n model=" + model
				+ "\n engineCC=" + engineCC + "\n fuelType=" + fuelType + "\n seatNo=" + seatNo + "\n color=" + color
				+ "\n price=" + price + "]";
	}
}
