package collection.listinterface;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
	
	public static void main(String[] args) {
		
		List<String> a1 = new ArrayList<String>();   //Parent type ref can point to child class object
		a1.add("Alice");
		a1.add("Ben");
		a1.add("Chris");
		a1.add("David");
		a1.add("Elcid");
		a1.add("Ben");               // In ArrayList we can also add duplicate values
		a1.add(null);                // In ArrayList we can add multiple null values
		System.out.println(a1);
		
		a1.add(2, "Frank");          // we can add also object with given index position
		System.out.println(a1);
		
		a1.remove("Chris");          // we can remove object from ArrayList
		a1.remove(5);                // we can remove object through given an index position
		System.out.println(a1);
		
		//a1.remove(15);               // suppose i will give the index position of out of size,
		                               // so in that case it will return an exception which is IndexOutOfBoundsException.
		try
		{
			a1.remove(15);             // 15th index is out of the ArrayList size
			System.out.println(a1);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Size: " + a1.size());  //Display current size of ArrayList
		
		System.out.println(a1.isEmpty());         // check the ArrayList is empty or not
		a1.clear();                               // Now ArrayList is Empty
		System.out.println(a1.isEmpty());         // Empty ArrayList so it returns true

	}

}
