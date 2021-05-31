package edu.mrgJava.inheritance;

public class Animal {
	
	//instance variables;
	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	
	//Default Constructor;
	public Animal() {
		
	}
	
	//Parameterized Constructor;
	public Animal(boolean veg, String food, int legs) {
		this.vegetarian = veg;
		this.eats = food;
		this.noOfLegs = legs;
	}
	
	// getter and setter methods;
	
	public boolean getVegetarian() {
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	public String getEats() {
		return eats;
	}
	
	public void setEats(String eats) {
		this.eats = eats;
	}
	
	public int getNoOfLegs() {
		return noOfLegs;
	}
	
	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}
