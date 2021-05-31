package javaAbstraction.exerciseStudent;

public abstract class AbsStudent {
	
	String nameOfYear;
	int age;
	int numOfStu;
	
	public String addNameOfYear(String nameOfYear) {
		this.nameOfYear = nameOfYear;
		return nameOfYear;
	}
	
	public int addAgeOfStudent(int age) {
		this.age = age;
		return age;
	}
	
	public int addNumOfStudent(int numOfStu) {
		this.numOfStu = numOfStu;
		return numOfStu;
	}
	
	public abstract void addStuName();
	
	public abstract void addStuGender();
	
	public abstract void addStuRace();
	
	public abstract int addStuIdNumber(int id);

	

}
