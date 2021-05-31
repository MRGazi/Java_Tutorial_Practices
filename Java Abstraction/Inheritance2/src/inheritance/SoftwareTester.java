package inheritance;


//SoftwareTester sub class which inherits the Employee class;
public class SoftwareTester extends Employee {
	
	double bonus = 15000;
	public SoftwareTester() {
		System.out.println("This is a Constructor of SoftwareTester");
	}
	
	public void displaySalary() {
		double softTesterSalary = salary + bonus;
		System.out.println("The Total Salary of Software Tester is = " + softTesterSalary);
	}
	

}
