package edu.mrgJava.classes.nestedClass;

public class NestedMain {

	public static void main(String[] args) {
		FirstExample obj = new FirstExample();
		
		FirstExample.A obj1 = obj.new A("Hossain");
		
		System.out.println(obj1.getDesignation());
		
		System.out.println(obj.MEMBER);
		
		FirstExample.B obj2 = obj.new B("Class B");
		System.out.println(obj2.getDesignation());
		obj2.setDesignation("House Wife");
		System.out.println(obj2.getDesignation());

	}

}
