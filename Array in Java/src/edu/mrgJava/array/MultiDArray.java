package edu.mrgJava.array;

public class MultiDArray {
	
	
	
	public void twoDArray() {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) 
				System.out.print(arr[i][j] + " ");
				System.out.println();
			}
	}
	
	public void twoDArrString() {
		// an array of String arrays of 3 rows and 4 columns
		String[][] arrStr = new String[4][4];
		
		for (int i = 0; i < arrStr.length; i++) {
		 for (int j = 0; j < arrStr[i].length; j++) {
		  arrStr[i][j] =" MRGazi " + " Bangladesh ";
		  System.out.print(arrStr[i][j] + " ");
		 }
		 System.out.println("");
		}
	}

}
