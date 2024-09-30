package fileHandling.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String filename="MyFolder/file1.dat";
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person person = (Person)ois.readObject();
		System.out.println(person);

		ois.close();
	}

}
