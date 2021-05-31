package javaAbstraction.exerciseStudent;

public class HolyCrossSchool extends AbsStudent {
	
	@Override
	public String addNameOfYear(String nameOfYear) {
		return nameOfYear;
	}
	
	@Override
	public int addAgeOfStudent(int age) {
		return age;
	}
	
	@Override
	public int addNumOfStudent(int numOfStu) {
		return numOfStu;
	}

	@Override
	public void addStuName() {
		System.out.println("Student Name is: " + "Mohammed S. Hasan");
	}

	@Override
	public void addStuGender() {
		System.out.println("Student Gender is: " + "Boy");

	}

	@Override
	public void addStuRace() {
		System.out.println("Student Race is: " + "Asian");

	}

	@Override
	public int addStuIdNumber(int id) {
		System.out.println("Student ID Number is as mentioned below:");
		return id;
	}

}
