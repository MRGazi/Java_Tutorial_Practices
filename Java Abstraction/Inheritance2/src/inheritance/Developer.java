package inheritance;

// Developer sub class which inherits the Employee class;
public class Developer extends Employee {
	double bonus = 10000;
	public Developer() {
		System.out.println("This is a Constructor of Developer Class");
	}
	
	public void displaySalary() {
		double developerSalary = salary + bonus;
		System.out.println("Total Salary of Developer is = " + developerSalary);
		System.out.println("==================================================\n");
	}

}
