package javaAbstraction.exercise;

public class TesterEmployee extends Employee {
	
	@Override
	public void description() { //Override description method;
		
		super.description(); //calling description method from super/ parent class;
		System.out.println("This is a Company's Software Tester");
	}


	@Override
	public void paidSalary() {
		System.out.println("Programmer sallary will be 25000 Dollar");

	}

}
