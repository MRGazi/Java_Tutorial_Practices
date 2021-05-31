package edu.mrgJavaEdu.controlFlowStatements;

public class LoopingStatements2 {
	
	public static void forLoop() {
		
		for(int i = 1; i <= 15; i++) {
			System.out.println("The forLoop Result is: " + i);
		}
	}
	
	public void forLoop1() {
		int a = 25;
		for (int i = 1; i <= a; i++) {
			System.out.println("Result = " + i);
		}
	}
	
	public void forLoop2() {
		int a = 25;
		for (int i = 1; i <= a; i++) {
			if (i > 10) {
				break;
			}
			
			System.out.println("Result = " + i);
		}
	}
	
	public void forLoop3() {
		int a = 25;
		for (int i = 1; i <=a; i++) {
			if (i <= 16) {
				continue;
			}
			System.out.print("Result = " + i + ", ");
		}
	}
	

}
