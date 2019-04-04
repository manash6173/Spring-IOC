package com.manash.beans;

import java.util.Properties;

public class FruitColors {
	private Properties fruitsColor;

	public FruitColors(Properties fruits) {
		System.out.println(fruits.getClass());
		this.fruitsColor = fruits;
	}

	@Override
	public String toString() {
		return "FruitColors [fruits=" + fruitsColor + "]";
	}

}
