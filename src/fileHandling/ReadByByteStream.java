package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadByByteStream {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		String filename="MyFolder/file.txt"; 
		@SuppressWarnings("resource")
		FileInputStream fis = new FileInputStream(filename);
		
		int wordCounter=0;
		int lineCounter=0;
		int charCounter=0;
		int n;
		n = fis.read();                                   // Check W ASCII Value
		while (n!=-1)
		{
			if(n==32)                                     //Word count in the file    //32 is ASCII value of space
			wordCounter++;
			charCounter++;                                //Count character
			if(n==10)                                     //how many lines in the file //10 is ASCII value of new line
			lineCounter++;
	     	System.out.print((char)n);
	     	n = fis.read();
		}
		System.out.println("\nFile Char Count: "+ charCounter); 
		System.out.println("File Line Count: "+ (lineCounter+1)); 
		System.out.println("File Word Count: "+ (wordCounter+1)); 
	}

}
