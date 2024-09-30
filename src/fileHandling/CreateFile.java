package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		String filename="MyFolder/file.txt";                 // create a file in we have already create a folder
		FileWriter fwriter = new FileWriter(filename);  //create object         //FileWriter is Checked Exception so throws the Exception for handing mechanism,
		fwriter.write("Welcome to Eclipse");                            //write the text in the file
		fwriter.write(" In Java, we can append a string in an existing file using FileWriter which has an option to open a file in append mode.\nJava FileWriter class is used to write character-oriented data to a file.\nIt is a character-oriented class that is used for file handling in Java.\nUnlike FileOutputStream class, we don’t need to convert the string into a byte array because it provides a method to write a string directly. ");
		//fwriter.append(" to Eclipse");                       //append the data
		fwriter.close();                                     //always close the writer because these data reflect in the file.
		System.out.println("Data Written to file " + filename);
		
		
	}
	
}
