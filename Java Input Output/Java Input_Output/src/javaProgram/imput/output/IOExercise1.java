
//Source: https://beginnersbook.com/2014/01/how-to-create-a-file-in-java/

package javaProgram.imput.output;

import java.io.File;
import java.io.IOException;

public class IOExercise1 {
	
	public void createIOFile() {
		try {
					
					File newFile = new File("F:\\Java Practices with Eclipse\\Java Input Output\\All Files Created by IO in Java\\newFile10.txt");
					
					boolean fileVariable = newFile.createNewFile();
					
					if (fileVariable) {
						System.out.println("The File is created Successfully");
					} else {
						System.out.println("The file is already in the specified location");
					}
					
			}
				
			catch (IOException e) {
				System.out.println("Please Check if there is any mistake");
				e.printStackTrace();
			}
	}

	public void createIOFile1() {
		try {
					
					File newFile = new File("F:\\Java Practices with Eclipse\\Java Input Output\\All Files Created by IO in Java\\newFile11.txt");
					
					boolean fileVariable = newFile.createNewFile();
					
					if (fileVariable) {
						System.out.println("The File is created Successfully");
					} else {
						System.out.println("The file is already in the specified location");
					}
					
			}
				
			catch (IOException e) {
				System.out.println("Please Check if there is any mistake");
				e.printStackTrace();
			}
	}
}
