package edu.mrgJava.multiDiArray;

public class MultiDimArray1 {
	
	public void multiD_Array() {
		
		int count = 15;
		
		for (int i = 0; i <= count; i++) {
			System.out.println("Index = " + i);
		}
	}
	
	public void multiD_Array1() {
		
		int count = 3;
		
		for (int i = 0; i <= count; i++) {
			for (int j = 0; j <= count; j++) {
				System.out.println(" Index = " + j);
			}
			System.out.println();
		}
	}
	
	public void multiD_Array2() {
		
		int[] arr1 = new int[5];
		
		arr1[0] = 15;
		arr1[1] = 150;
		arr1[2] = 25;
		arr1[3] = 155;
		arr1[4] = 55;
		
		for (int i = 0; i < arr1.length; i++) {
				System.out.println(" Index " + i + "= " + arr1[i]);
		}
		System.out.println();
	}
	
}
