package javaControl.statements.IfLoopBranch;

public class ContStatement3 {
	int x = 25;
	int y = 20;
	
	//Nested if statements;
	
	public void method1() {
		
		if (x > y) {
			System.out.println("Result: x is greater than y");
			} else if (x < y) {
				System.out.println("Result: x is less than y");
			} else if (x * y == 500) {
				System.out.println("Result: multiplication of x and y is 500");
			} else {
				System.out.println("Result: condition inconsistant");
		}
	}
	
	public void method2() {
		if (x > y) {
			if (x % 5 == 0) {
				System.out.println("Result: x is greater than y and odd number");
			} else {
				System.out.println("Result: x is greater than y and even number");
			}
		} else {
			System.out.println("Result: x is less than y");
		}
	}
}
