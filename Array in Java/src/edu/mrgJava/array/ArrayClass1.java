package edu.mrgJava.array;

public class ArrayClass1 {
	String[] strArray;
	int[] myArray;
	
		
	public void arrayMethod() {
		
		myArray = new int[10];
		
		myArray[0] = 10;
		myArray[1] = 15;
		myArray[2] = 20;
		myArray[3] = 25;
		myArray[4] = 30;
		myArray[5] = 35;
		myArray[6] = 40;
		myArray[7] = 45;
		myArray[8] = 50;
		myArray[9] = 55;
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Index = " + i + " ==> " + myArray[6]);
		}
		
	}
	
	public void stringMethod() {
		
		strArray = new String[7];
		
		strArray[0] = "Sunday";
		strArray[1] = "Monday";
		strArray[2] = "Tuesday";
		strArray[3] = "Wednesday";
		strArray[4] = "Thursday";
		strArray[5] = "Friday";
		strArray[6] = "Saturday";
		
		System.out.println(strArray[3]);
		
	}
	
	public void weekdays() {
		System.out.println("Weekday are: ");
		for(int i = 1; i<=5;i++) {
			
			System.out.println("		" + strArray[i]);
		}
	}
	
	public void daysOfWeekend() {
		System.out.println("Days of the Weekends are: " + strArray[0] + " and " + strArray[6]);
	}
}
