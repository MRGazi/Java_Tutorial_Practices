package javaControl.statements.IfLoopBranch;

public class ExerciseIf {
	
	int x = 10; 
	int y = 15;
	
	public ExerciseIf() {
		
	}
	
	//if else statements;
	
	public void isTest1() {
		//Recommended Style
		if (x > y) {
			System.out.println("Result: x is greater then y");
			
		} else {
			System.out.println(" Result: x is smaller then y");
		}
	}
	
	//Simple if Statements
	
	public void isTest2() {
			// Style without else keyword;
			if (x > y) {
				System.out.println("Result: x is greater then y");
			}
			
			{
				System.out.println(" Result: x is smaller then y");
			}
	}
	
	public void isTest3() {
		// Style without else keyword and braces;
		if (x > y) 
			System.out.println("Result: x is greater then y");
			System.out.println(" Result: x is smaller then y");
		
	}

}
