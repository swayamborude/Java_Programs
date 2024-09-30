package collection.queueinterface;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> ages = new PriorityQueue<Integer>();
		ages.add(12);
		ages.add(45);
		ages.add(10);
		ages.add(23);
		System.out.println("Priority Queue: " + ages);          // [10, 12, 45, 23]
		System.out.println("Size of Queue: " + ages.size());   // 4
		System.out.println("Remove Element by Ascending Order: " + ages.remove()); // 10 Because by default priority queue remove by ascending order
		System.out.println("Size of Queue after removing Element: " + ages.size());   // 3
		System.out.println("Remove Element by Ascending Order: " + ages.remove()); // 12
		
		
		// In Reverser Order Elements Using Collection Class;
		System.out.println("\nReverse Order Function Using Collection Class:");
		PriorityQueue<Integer> ages1 = new PriorityQueue<Integer>(Collections.reverseOrder());
		ages1.add(12);
		ages1.add(10);
		ages1.add(45);
		ages1.add(23);
		System.out.println("Reverse Order Queue: " + ages1);          // [45, 23, 12, 10]
		System.out.println("Size of Queue: " + ages1.size());   // 4
		System.out.println("Remove Element by Reverse Order: " + ages1.remove()); // 45 Because now priority queue remove by reverse order
		System.out.println("Size of Queue after removing Element: " + ages1.size());   // 3
		System.out.println("Remove Element by Reverse Order: " + ages1.remove()); // 23
		
	}

}
