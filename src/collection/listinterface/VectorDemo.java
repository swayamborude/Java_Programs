package collection.listinterface;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		//1. Default Capacity Constructor of vector
		Vector<String> vector = new Vector<String>();           // Default capacity = 10,	increment = double
		System.out.println("Capacity: " + vector.capacity());   // Capacity: 10
		System.out.println("Size: " + vector.size());           // Size: 0
		
		for (int i=1;i<=10;i++)
			vector.add("Alice");
		System.out.println("Capacity: " + vector.capacity());   // Capacity: 10
		System.out.println("Size: " + vector.size());           // Size: 10
		vector.add("Alice");                                    
		System.out.println("Capacity: " + vector.capacity());   // Capacity: 20
		System.out.println("Size: " + vector.size());           // Size: 11
		
		//2. User define Capacity Constructor of vector
		Vector<String> vector2 = new Vector<String>(5); // User define capacity = 5, default increment = double
		for (int i=1;i<=6;i++)
			vector2.add("Alice");
		System.out.println("Capacity: " + vector2.capacity());  // Capacity: 10
		System.out.println("Size: " + vector2.size());          // Size: 6
		
		//3. User define Capacity and Increment Constructor of vector
		Vector<String> vector3 = new Vector<String>(5,3); // User define capacity = 5, increment = 3
		for (int i=1;i<=6;i++)
			vector3.add("Alice");
		System.out.println("Capacity: " + vector3.capacity());  // Capacity: 8
		System.out.println("Size: " + vector3.size());          // Size: 6	
		
		// ArrayList
		ArrayList<String> name = new ArrayList<String>();  // <String> is define - the array store only string value
		name.add("Alice");
		name.add("Ben");
		name.add("Chris");
		
		//4. ArrayList To Vector - This is use to multi-threading
		Vector<String> vector4 = new Vector<String>(name); // Convert given collection to a Vector
		System.out.println(vector4);
		
		vector4.addElement("Frank");                  // Add Element in List.
		System.out.println(vector4.elementAt(0));     // Return the specified Index Position element.
		System.out.println(vector4);
		
	}

}
