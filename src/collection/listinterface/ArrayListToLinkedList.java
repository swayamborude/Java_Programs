package collection.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
	
	public static void main(String[] args) {
		
		ArrayList<String> student = new ArrayList<String>();
		student.add("Alice");
		student.add("Ben");
		student.add("Chris");
		System.out.println(student); // [Alice, Ben, Chris]
		
		LinkedList<String> list = new LinkedList<String>(student); // Convert the ArrayList To LinkedList
		list.addFirst("Dom");
		System.out.println(list); // [Dom, Alice, Ben, Chris]
		System.out.println(list.peekFirst()); // only returns the first element it does not remove.
		System.out.println(list);             // [Dom, Alice, Ben, Chris]
		System.out.println(list.pollFirst()); // it will return and remove also the element.
		System.out.println(list);             // [Alice, Ben, Chris]
		System.out.println(list.removeLast());// Chris
		System.out.println(list);             // [Alice, Ben]
		 
	}

}
