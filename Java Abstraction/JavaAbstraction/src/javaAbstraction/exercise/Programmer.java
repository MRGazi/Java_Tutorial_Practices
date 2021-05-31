package javaAbstraction.exercise;

public class Programmer extends Employee {
	
	@Override
	public void description() { //Override description method;
		super.description();
		System.out.println("This is a Company's Programmer");
	}

	@Override
	public void paidSalary() { //salary must be declared in the child class;
		System.out.println("Programmer sallary will be 30000 Dollar");
		
	}

}
