package edu.mrgJava.method;

public class MethodExample1 {
	
	static double x, y, z;
	
	//Static Method Examples;
	
	public static double math1() {
		return x;
	}
	
	public static double math2(){
		return y;
	}
	
	public static double math3(){
		return z;
	}
	
	public static void calculate(int a, int b, int c) {
		MethodExample1.x = a;
		MethodExample1.y = b;
		MethodExample1.z = c;
	}
		
	public static double addition() {
		return math1() + math2() + math3();	
	}
	
	public static double multiplication() {
		return math1() * math2() * math3();
	}
	

}
