package edu.mrgJava.arrayInJava;

public class JavaArray1 {
	
	public JavaArray1() {
		
	}
	
	public void arrayMethod1() {
		System.out.println("********* " + "arraymethod1" + " **********");
		System.out.println();
		int[] myArray = {1,2,3,4,5};
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("The Array Element at Index: " + i + " is " + myArray[i]);
		}
		System.out.println("--------------------------------");
		
	}
	
	public void arrayMethod2() {
		System.out.println("********* " + "arraymethod2" + " **********");
		System.out.println();
		int i = 2;
		int[] myArray = {1,2,3,4,5};
		
		while (i < myArray.length) {
			System.out.println(myArray[i]);
			i++;
			
		}
		
		System.out.println(myArray[3]);
		System.out.println("--------------------------------");
		
	}
	
	public void arrayMethod3() {
		
		System.out.println("********* " + "arraymethod3" + " **********");
		System.out.println();
		
		int[] myList = {20,30,40,50,60};
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		
		int[] myArray = new int[5];
		myArray[0] = myList[0];
		myArray[1] = myList[1];
		myArray[2] = myList[2];
		myArray[3] = myList[3];
		myArray[4] = myList[4];
		
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println();
			System.out.println("The Array Element at Index: " + i + " is " + myArray[i]);
		}
		
		System.out.println("--------------------------------");
	}
	
	public void arrayMethod4() {
		System.out.println("********* " + "arraymethod1" + " **********");
		System.out.println();
		String[] myArray = {"Dhaka", "Comilla", "Chittagong", "Kholna", "Rajshahi", "Jessohor"};
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("The Array Element at Index: " + i + " ---> " + myArray[i]);
		}
		System.out.println("--------------------------------");
		
	}

}
