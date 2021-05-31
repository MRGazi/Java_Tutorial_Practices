package edu.mrgJavaEdu.controlFlowStatements;

public class SelectionStatements {
	
	// Simple if Statement;
	public void ifStatement() {
		int i = 10;
		
		if(i <= 10) {
			System.out.println("This is a simple if Statement");
			System.out.println("This is how we write simple if Statement");
		}
	}
	
	public void ifElseStatement() {
		int x = 10;
		if(x > 9) {
			System.out.println("x is greater then 9");
		}else {
			System.out.println("x is not greater then 9");
		}
	}
	
	public void nestedIfStatement() {
		int x = 9;
		
		if (x > 10) {
			if (x % 2 == 0) {
				System.out.println("x is greater then 10 and even number");
			}else {
				System.out.println("x is  greater then 10 and not even number");
			}
			
		}else {
			System.out.println("x is less then 10");
		}
	}
	
	public static void nestedIfStatement1() {
		int x = 5;
		int y = 10;
		
		if(x < y) {
			if(y % x == 0) {
				System.out.println("This is second nested if statement");
			} else {
				System.out.println("The above condition does not metch");
			}
		}else {
			System.out.println("Something is wrong in this condition");
		}
	}
	
	public void ifElseIf_Else() {
		int a = 20;
		int b = 45;
		
		if (a > b) {
			System.out.println("This is if else if else statement");
		} else if (b % a == 5) {
			System.out.println("This is if esle if .. else statement");
		} else if (a == b) {
			System.out.println("variable a and b are equal");
		} else {
			System.out.println("Condition is Wrong!!");
		}
	}
	
	public void switchStatement() {
		
		int a = 7;
		
		String daysOfWeek;
		
		switch (a) { 
		
		case 1:
			daysOfWeek = "Sunday";
			break;
		case 2:
			daysOfWeek = "Monday";
			break;
		case 3:
			daysOfWeek = "Tuesday";
			break;
		case 4:
			daysOfWeek = "Wednesday";
			break;
		case 5:
			daysOfWeek = "Thursday";
			break;
		case 6:
			daysOfWeek = "Friday";
			break;
		case 7:
			daysOfWeek = "Saturday";
			break;
			
		default:
			daysOfWeek = "You Put Wrong Information";
			break;
						
		}	
		System.out.println(daysOfWeek);
	
	}

}
