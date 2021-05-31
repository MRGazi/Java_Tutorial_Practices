package javaProgram.imput.output;

import java.io.File;
import java.io.IOException;


public class IOExercise2 {
	
	public void deleteFile1 () {
		
		File file = new File("F:\\Java Practices with Eclipse\\Java Input Output\\All Files Created by IO in Java\\newFile6.txt");
		
		if (file.delete()) {
			System.out.println(file.getName() + " >>> " +  "File is deleted from the location");
		} else {
			System.out.println(file.getName() + " >>> " + "File is not found check the file name well in the location");
		}
		
		
	}

}
