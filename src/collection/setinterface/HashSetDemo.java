package collection.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<String> name = new HashSet<String>();
		name.add("Alice");
		name.add("Chris");
		name.add("Chris");         // In Set Interface Duplicate element not allowed
		name.add("Dom");
		name.add("Ben");
		name.add(null);            // In Set Interface Only single null allowed
		System.out.println("Name List: " + name + "\n");  // Output get Random Order // Order is not maintained
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,5));
		System.out.println("Set 1: " + set1);    // Set 1: [1, 2, 3]
		System.out.println("Set 2: " + set2);    // Set 2: [3, 4, 5]
		set1.addAll(set2);                       // Adding all elements of set2 to set1
		System.out.println("Set 1 U Set 2: " + set1 + "\n");    // Set 1 U Set 2: [1, 2, 3, 4, 5]
		
		
		Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(5,6,7));
		Set<Integer> set4 = new HashSet<Integer>(Arrays.asList(7,8,9));
		System.out.println("Set 3: " + set3);    // Set 3: [5, 6, 7]
		System.out.println("Set 4: " + set4);    // Set 4: [7, 8, 9]
		set3.retainAll(set4);                         // set3 Keeps only those elements present inside the set3 and set4 also
		System.out.println("Set 3 n Set 4: " + set3); // Set 3 n Set 4: [7]
		
	}

}
