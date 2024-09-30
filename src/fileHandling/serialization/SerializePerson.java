package fileHandling.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {
	
	public static void main(String[] args) throws IOException {
		
		String filename="MyFolder/file2.dat";
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Person person = new Person(123123123L, "Alice", 20);
		oos.writeObject(person);
		System.out.println("Object Written to File");
	
		oos.close();
	}

}
