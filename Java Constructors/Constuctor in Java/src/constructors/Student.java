package constructors;

public class Student {
	
	private String sName;
	private int iAge;
	private int iIdNumber;
	
	public Student() {
		System.out.println("This is Student Class Constructor");
	}
	
	public Student(String s, int a, int id) {
		this.sName = s;
		this.iAge = a;
		this.iIdNumber = id;
	}
	
	public void setName(String name) {
		this.sName = name;
	}
	
	public String getName() {
		return sName;
	}
	
	public void setAge(int age) {
		this.iAge = age;
	}
	
	public int getAge() {
		return iAge;
	}
	
	public void setIdNumber(int id) {
		this.iIdNumber = id;
	}
	
	public int getIdNumber() {
		return iIdNumber;
	}
	
	public void studentDetails() {
		
	}
	

}
