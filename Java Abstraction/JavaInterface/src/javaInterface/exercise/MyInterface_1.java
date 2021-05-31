package javaInterface.exercise;

public interface MyInterface_1 {
	
	int data11 = 101;
	int data12 = 102;
	
	public void myMethod_11();
	public void myMethod_12();
	
	default String myMethod_13() {
		return "default myMethod_13 is Executing....";
	}
	
	static String myMethod_14() {
		return "static myMethod_14 is Executing....";
	}
}
