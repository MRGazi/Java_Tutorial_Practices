package constructors;

 public class ConstChaining2 extends ConstChaining1 {
	 
	 int age;

	public ConstChaining2(String name, int id, int salary, int age) {
		super (name, id, salary);
		this.age = age;
	}
	
	public void empDetails() {
		System.out.println(name+s+id+s+salary+s+age);
	}

}
