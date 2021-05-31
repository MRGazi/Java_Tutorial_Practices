package javaAbstraction.exercise;

public abstract class Employee { //Abstract class will have no object that is cannot be instantiated;
	//this is a regular method/ function;
	public void description() {
		System.out.println("This is a Company's Employee");
	}
	
	public abstract void paidSalary(); // abstract method will have no body;
	
}
