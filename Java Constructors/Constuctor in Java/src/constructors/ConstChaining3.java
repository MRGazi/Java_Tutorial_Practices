package constructors;

public class ConstChaining3 extends ConstChaining2 {
	
	String uniform;
	
	public ConstChaining3(String name, int id, int salary, int age, String uniform) {
		super(name, id, salary, age);
		this.uniform = uniform;
	}

}
