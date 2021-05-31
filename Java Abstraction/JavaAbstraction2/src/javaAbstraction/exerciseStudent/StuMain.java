package javaAbstraction.exerciseStudent;

public class StuMain {

	public static void main(String[] args) {
		
		AbsStudent obj1 = new HolyCrossSchool();
		
		obj1.addStuName();
		obj1.addStuGender();
		obj1.addStuRace();
		
		System.out.println("The Student Year is:" + obj1.addNameOfYear("Year Eleven"));
		System.out.println("The total number of Student in the School is: " + obj1.addNumOfStudent(3000));
		System.out.println("Student Current Age:" + obj1.addAgeOfStudent(18));
		System.out.println("The ID Number of Student is: " + obj1.addStuIdNumber(300));
		
		System.out.println();
		System.out.println();
	}

}
