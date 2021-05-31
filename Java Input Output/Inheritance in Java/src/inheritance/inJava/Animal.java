package inheritance.inJava;

public class Animal {
	
	int number;
	String name;
	
	public Animal (int aniNumber, String aniName) {
		this.number = aniNumber;
		this.name = aniName;
	}
	
	public void eat () {
		System.out.println ("Animals eat wild food");	
	}
	
	public void run () {
		System.out.println ("All animal can run");
		
	}
	

}

class Dog extends Animal {

	public Dog(int aniNumber, String aniName) {
		super(aniNumber, aniName);
		// TODO Auto-generated constructor stub
	}
	
}

class Cat extends Animal {
	
}

class Monkey extends Animal {
	
}
