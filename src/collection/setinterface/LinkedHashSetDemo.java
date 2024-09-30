package collection.setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		// LinkedHashSet is don't allowed duplicates and maintained the order
		Set<String> name = new LinkedHashSet<String>();
		name.add("Alice");
		name.add("Chris");
		name.add("Chris");         // In Set Interface Duplicate element not allowed
		name.add("Dom");
		name.add("Ben");
		name.add(null);            // It allows null values
		System.out.println(name);

	}

}
