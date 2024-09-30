package collection.listinterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		ArrayList<String> name = new ArrayList<String>();  // <String> is define - the array store only string value
//		name.add("Alice");
//		name.add("Ben");
//		System.out.println("Name of Peoples: " + name);
//		
//		ArrayList<Integer> age= new ArrayList<Integer>();  // <Interger> is define - the array store only integer value
//		age.add(21);
//		age.add(25);
//		System.out.println("Age of Peoples: " + age);
//		
//		ArrayList<String> student1 = new ArrayList<String>(name); // This constructor is initialized with the elements from the collection name. 
//		System.out.println(student1);                             // [Alice, Ben]
//		
//		ArrayList<String> student2 = new ArrayList<String>(25);   // This constructor is specified its capacity. 
//		System.out.println(student2);                             // Now this capacity of ArrayList is 25.
//		                                                          // and by default capacity of ArrayList is 10.
		
		ArrayList<String> studName = new ArrayList<String>();     // Create ArrayList
		studName.add("Alice");                                    // Add element
		studName.add("Ben");
		System.out.println("Students Name:- " + studName);
		
		studName.add(1, "Chris");                                 // Inserts the specified element at the specified position in this list
		System.out.println("After Adding Chris at the 1st Index position:-  " + studName);
		// Inserts the specified element at the specified position in this list
		
		System.out.println("Returns the element at the 2nd position :- " + studName.get(2));
		// Returns the element at the specified position in this list.
		
		System.out.println("Check List is Empty or Not:- " + studName.isEmpty());
		// Check List is Empty or Not, if List is empty it returns true
		
		System.out.println("Remove Element to the 0th index position:- " + studName.remove(0));
		// Removes the element at the specified position in this list.
		
		System.out.println("After removing List:- " + studName);
		// After removing the element
		
		System.out.println("Returns the number of elements in this list:- " + studName.size());
		// Returns the number of elements in this list.
		
		studName.clear(); 
		// Removes all of the elements from this list	
	}

}

