package edu.mrgJava.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Dog d = new Dog(false, "Meat", 4, "Black", "Bow Bow");
		
		
		System.out.println("Dog's Vegitable habit is: " + d.getVegetarian());
		System.out.println("Dog's food habit is: " + d.getEats());
	
	}

}
