package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSingleLine {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		String filename="MyFolder/file.txt"; 
		FileReader freader = new FileReader(filename);
		
		BufferedReader br = new BufferedReader(freader);
		String line = br.readLine();
		System.out.println(line);
		br.close();
		freader.close();
	}

}
