package edu.mrgJavaEdu.controlFlowStatements;

public class SwitchCase {
	
	public void switchCase() {
		
		int i = 1;
		
		switch (i) {
		
		case 0: 
			System.out.println("i is 0");
			break;
			
		case 1:
			System.out.println("i is 1");
			break;
		case 2:
			System.out.print("i is 2");
			System.out.println(" and This is perfect Number");
			break;
		
		default:
			System.out.println("i is not in the List");
			System.out.println("Please check the value of i for further decision");
			break;
		
		}
	}

}
