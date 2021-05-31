package edu.mrgJava.multiDiArray;



public class MultiDimArray2 {
	
	public void multiD_array() {
		
		int[][] arr1 = new int[5][10];
		
		arr1[0][0] = 500;
		arr1[0][1] = 100;
		arr1[0][2] = 200;
		arr1[0][3] = 300;
		arr1[0][4] = 600;
		
		arr1[1][0] = 400;
		arr1[2][0] = 700;
		arr1[3][0] = 800;
		arr1[4][0] = 900;
		
		for(int row = 0; row < arr1.length; row++ ) {
			for(int column = 0; column < arr1.length; column++) {
				
				System.out.print(arr1[row][column] + " | ");
			}
			
			System.out.println();
		}
	}

}
