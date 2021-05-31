package javaControl.statements.IfLoopBranch;

public class ContStatement4 {
	
	int x = 25;
	static int y = 20;
	
	//for loop;
	
	public static void method1() {
		
		for (int x = 0; x <= y; x++) {
			System.out.println("The Value of X = " + x);
		}
	}
	
	//for each loop;
	public static void method2() {
		int [] num1 = { 10, 15, 20, 25, 30,};
		for(int p: num1) {
			System.out.println("The value of p is: " + p);
		}
		
	}
	
	public static void method3() {
		String [] str1 = { "Cat", "Dog", "Horse", "Man", "Girl"};
		for(String creature: str1) {
			System.out.println("The value of Creature is: " + creature);
		}
		
	}

}
