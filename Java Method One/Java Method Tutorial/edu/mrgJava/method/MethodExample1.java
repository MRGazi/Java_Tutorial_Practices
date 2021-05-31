package edu.mrgJava.method;

public class MethodExample1 {
	
	//Instance Variable
	public int x; 
	public int y;
	
	//Static/ class variable
	private static int a;
	private static int b;
	
	//default Constructor;
	public MethodExample1() {
		
	}
	
	//parameterized Constructor;
	
	public MethodExample1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int addition() {
		return x + y;
	}
	
	public void addition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int subtraction() {
		return x - y;
	}
	
	public void subtraction(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int multiplication() {
		return x * y;
	}
	
	public void multiplication(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int division() {
		return x/y;
	}
	
	public void division(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		MethodExample1.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		MethodExample1.b = b;
	}
	
	

}
