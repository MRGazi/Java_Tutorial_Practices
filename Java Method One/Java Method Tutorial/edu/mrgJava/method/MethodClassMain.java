package edu.mrgJava.method;



public class MethodClassMain {
	
	

	public static void main(String[] args) {
		
		MethodExample1 me = new MethodExample1();
		
		me.addition(50, 20);
		System.out.println("Addition = " + me.addition());
		
		me.subtraction(20, 10);
		System.out.println("Subtraction = " + me.subtraction());
		
		me.multiplication(me.addition(), me.subtraction());
		System.out.println("Multiplication =" + me.multiplication());
		
		//static method Examples;
		
		MethodExample1.setA(50);
		MethodExample1.setB(30);
		
		int a = MethodExample1.getA();
		int b = MethodExample1.getB();
		
		System.out.println("Static Method getA = " + a);
		System.out.println("Static Method getA = " + b);
		
		me.addition(a, b);
		me.subtraction(a, b);
		me.multiplication(a, b);
		me.division(a, b);
		
		int p = me.addition();
		int q = me.subtraction();
		int r = me.multiplication();
		int t = me.division();
		
		System.out.println("*****************************");
		System.out.println("Addition = " + p);
		System.out.println("Subtraction = " + q);
		System.out.println("Multiplication = " + r);
		System.out.println("Division = " + t);
		System.out.println("*****************************");
		
	}

}
