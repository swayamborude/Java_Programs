package collection.listinterface;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> student = new LinkedList<String>();
		student.add("Alice");
		student.add("Chris");
		System.out.println("Student Name:- " + student);
		
		student.add(1, "Ben");
		// Inserts the specified element at the specified position in this list
		System.out.println("After adding Element at the specific position:- " + student);
		
		System.out.println("Display first name in the list:- " + student.getFirst());
		// Returns the first element in this list
		
		System.out.println("Display last name in the list:- " + student.getLast());
		// Returns the last element in this list.
		
		student.addFirst("Tom");
		// Inserts the specified element at the beginning of this list
		System.out.println("Add the element in list at the beginning " + student);
		
		student.addLast("Tom");
		// Appends the specified element to the end of this list
		System.out.println("Add the element in list at the end of the list:- " + student);
		
		student.pop();
		// Pop the element means removes the first element of this list
		System.out.println("Remove the first element:- " + student);
		
		student.push("Virat");
		// Inserts the element at the front of this list.
		System.out.println("Add the element at the front of the list:- " + student);
		
		System.out.println("Returns the first element:- " + student.peekFirst());
		// It returns the first element but it does not remove
		
		System.out.println("Returns the last element:- " + student.peekLast());
		// It returns the last element but it does not remove
		
		System.out.println("Remove first Element:- " + student.pollFirst());
		// It returns and remove the first element
		
		System.out.println("Remove last Element:- " + student.pollLast());
		// It returns and remove the last element
		
		System.out.println(student);
		// After remove first and last element	
	}

}
