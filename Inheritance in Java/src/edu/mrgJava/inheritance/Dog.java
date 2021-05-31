package edu.mrgJava.inheritance;

public class Dog extends Animal {
	
	private String color;
	private String sound;
	
	public Dog(boolean veg, String food, int legs, 
			String color, String sound) {
		
		super (veg, food, legs);
		this.color = color;
		this.sound = sound;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
