package edu.mrgJava.inheritance;

public class Cat extends Animal {
	
	//instance variable;
	private String color;
	
	//parameterized Constructor;
	public Cat(boolean veg, String food, int legs) {
		super(veg, food, legs);
		color = "White";
	}
	
	//parameterized Constructor;
	public Cat(boolean veg, String food, int legs, String color) {
		super(veg, food, legs);
		this.color = color;
	}
	
	//getter and setter methods;
	public String getColor() {
		return color;
	}
	
	public void  setColor(String color) {
		this.color = color;
	}

}
