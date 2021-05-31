package constructors;

public class ConstChaining1 {
	
	int salary;
	String name;
	int id;
	String s = ", ";
	
	public ConstChaining1(String name, int id, int salary) {
		this.name= name;
		this.id= id;
		this.salary = salary;
	}
	
	public void empDetails() {
		System.out.println(salary +s+name+s+id);
	}

}
