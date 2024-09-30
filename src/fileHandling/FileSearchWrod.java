package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSearchWrod {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		String filename="MyFolder/file.txt"; 
		FileReader fis = new FileReader(filename);
		
		String word="Swayam";
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fis);
		String line;
		int flag=0;
		
		while((line=br.readLine()) != null)
		{
			if(line.indexOf(word) !=-1)
			{
				System.out.println("Word Found");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Word Not Found");

	}

}
