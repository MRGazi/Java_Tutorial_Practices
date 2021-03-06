package edu.mrgJava.array.multidimension;

public class MultiDimMain {

	public static void main(String[] args) {
		// an array of int arrays of 2 row and 3 columns
		  int[][] twoDimArray = new int[2][3];
		  for (int i = 0; i < twoDimArray.length; i++) {
		   for (int j = 0; j < twoDimArray[i].length; j++) {
		    twoDimArray[i][j] = j;
		    System.out.print(twoDimArray[i][j] + " ");
		   }
		   System.out.println("");
		  }

		  // an array of String arrays of 3 rows and 4 columns
		  String[][] arrStr = new String[3][4];
		  for (int i = 0; i < arrStr.length; i++) {
		   for (int j = 0; j < arrStr[i].length; j++) {
		    arrStr[i][j] = "Str" + j;
		    System.out.print(arrStr[i][j] + " ");
		   }
		   System.out.println("");
		  }

		  // creating and initializing two dimensional int array with shortcut
		  // syntax
		  int[][] arrInt = { { 1, 2,3 }, { 3, 4, 5 } };
		  for (int i = 0; i < arrInt.length; i++) {
		   for (int j = 0; j < arrInt[i].length; j++) {
		    System.out.print(arrInt[i][j] + " ");
		   }
		   System.out.println("");
		  }

	}

}
