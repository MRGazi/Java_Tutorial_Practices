package javaAbstraction.exercise;

public class AbsMain {

	public static void main(String[] args) {
		Employee e = new Programmer();
			e.description();
			e.paidSalary();
		
		 e = new TesterEmployee();
		 	e.description();
		 	e.paidSalary();

	}

}
