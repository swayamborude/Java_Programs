package fileHandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		File  file = new File("MyFolder");  //Give a folder name
		if(!file.exists())                  //if does not any folder for this name so create it
		{
			file.mkdir();                   //folder=Directory
		}

		System.out.println("Folder Created");  //Create folder
	}

}
