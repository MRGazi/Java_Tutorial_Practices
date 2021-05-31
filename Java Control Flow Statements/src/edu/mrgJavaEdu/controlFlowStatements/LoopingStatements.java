package edu.mrgJavaEdu.controlFlowStatements;

public class LoopingStatements {
	
	public static void whileStatement1() {
		int i = 1;
		while(i <= 20) {
			System.out.println("The While Loop Result is: " + i);
			i = i+1;
		}
	}
	
	public static void whileStatement2() {
		int i = 1;
		while (i <= 20) {
			System.out.println("The while Loop result is: " + i);
			i = i+2;
		}
	}
	
	public static void whileStatement3() {
		int i = 5;
		while (i <= 20) {
			System.out.println("The while loop result is: " + i);
			i = i+3;
		}
	}
	
	public static void whileStatement4() {
		int i = 25;
		while(i > 1) {
			System.out.println("The while loop result is: " + i);
			i = i-5;
		}
	}
	
	public void doWhile() {
		int i = 1;
		do {
			System.out.println("The doWhile result is: " + i);
			i = i+1;
		} while (i <= 15);
	}
	
	public void doWhile1() {
		int i = 15;
		do {
			System.out.println("The doWhile result is: " + i);
			i = i - 2;
		}while(i > 1);
	}

}
