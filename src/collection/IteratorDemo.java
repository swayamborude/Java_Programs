package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alice");
		names.add("Chris");
		names.add("Ben");
		names.add("Tom");
		
		// Iterator
		// Iterator has give the only next element
		Iterator<String> namesIterator = names.iterator();
		while(namesIterator.hasNext())                      // check in list next element is there if yes then print
		{
			System.out.println(namesIterator.next());       // Alice,Chris,Ben,Tom
		}
		
		// List Iterator
		// List Iterator has give the both element next and previous
		System.out.println("\nList Iterator:");
		ListIterator<String> namesListInterator = names.listIterator();
		namesListInterator.add("Jack");
		System.out.println(names);                               // [Jack, Alice, Chris, Ben, Tom]
		System.out.println("\nList Iterator for Next Element:");
		while(namesListInterator.hasNext())                      // Alice,Chris.Ben,Tom
		{
			System.out.println(namesListInterator.next());
		}
		System.out.println("\nList Iterator for Previous Element:");
		while(namesListInterator.hasPrevious())
		{
			System.out.println(namesListInterator.previous());   // Tom,Ben,Chris,Alice
		}
		
		// Add Some Element in list between any element
		System.out.println("\nAdding Bob after the Chris:");
		while(namesListInterator.hasNext())
		{
			if(namesListInterator.next().equals("Chris"))
			{
				namesListInterator.add("Bob");
			}
		}
		System.out.println(names);
		
		
	}

}
