package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLine {
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		
		String filename="MyFolder/file.txt"; 
		FileReader freader = new FileReader(filename);
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(freader);
		String line;
		
		while((line=br.readLine()) != null)
		{
			System.out.println(line);
		}
		
	}

}
