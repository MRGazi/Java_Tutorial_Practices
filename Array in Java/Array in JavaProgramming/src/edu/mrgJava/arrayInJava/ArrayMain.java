package edu.mrgJava.arrayInJava;

public class ArrayMain {

	public static void main(String[] args) {
		
		int[][] array = new int[10][10];
		array[0][0] = 100;
		array[0][1] = 200;
		array[9][8] = 100;
		array[9][9] = 200;
		
		
		for(int a = 0; a < array.length; a++) {
			for(int x = 0; x < array.length; x++) {
				System.out.print(array[a][x] +"\t"+"|");
			}
			
			System.out.println();
		}
		

	}

}
