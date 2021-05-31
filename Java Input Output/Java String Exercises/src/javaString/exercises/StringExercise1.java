package javaString.exercises;

public class StringExercise1 {
	
	public void selectCharacterIndex() {
		String str = "United States of America";
		String str1 = "The United Kingdom";
		
		int index1 = str.charAt(0);
		int index2 = str.charAt(3);
		int index3 = str.charAt(5);
		int index4 = str.charAt(10);
		int index5 = str.charAt(15);
		
		System.out.printf("%1$S", "The Original String is: " + str + " <===> " + str1 + "\n");
		
		System.out.println("The Character at index 0 is: " + (char) index1);
		System.out.println("The Character at index 3 is: " + (char) index2);
		System.out.println("The Character at index 5 is: " + (char) index3);
		System.out.println("The Character at index 10 is: " + (char) index4);
		System.out.println("The Character at index 15 is: " + (char) index5);
		
		
	}
	
	

}
