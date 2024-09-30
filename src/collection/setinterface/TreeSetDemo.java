package collection.setinterface;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> name = new TreeSet<String>(); // In TreeSet declare a Type is compulsory because it does not support Heterogeneous data. 
		name.add("Alice");
		name.add("Chris");         // it gives the output ascending order
		name.add("Chris");         // In Set Interface Duplicate element not allowed
		name.add("Dom");
		name.add("Ben");
	//	name.add(null);            // TreeSet does not support null.
		System.out.println(name);
		
		Set<Integer> number = new TreeSet<Integer>(Arrays.asList(100,50,150,200,175,25,75));
		System.out.println(number); // Print the output Ascending Order	because internally it will use in-order traversal.
		
	
	}

}
