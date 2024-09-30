package collection.comparable;

import java.util.Set;
import java.util.TreeSet;

import collection.comparator.AdharComparator;
import collection.comparator.AgeComparator;
import collection.comparator.NameComparator;
import collection.comparator.PersonData;

public class TreeSetExComparable {
	
	public static void main(String[] args) {
		
		// Using Comparable
		Set<Person> person = new TreeSet<Person>(); // In Person Class object i will use compareTo method. (Compare by name)
		person.add(new Person(1111,"Alice",25));    // Person Class is Implements Comparable Interface
		person.add(new Person(3333,"Ben",22));      // Using Comparable Interface we will use only one compareTo method access at a time
		person.add(new Person(2222,"Chris",30)); 
		System.out.println("Using Comparable: " + "\n" + person + "\n");
		
		// Using Comparator
		//One Class having one single responsibility
		Set<PersonData> nameWiseName = new TreeSet<PersonData>(new NameComparator()); // In PersonData Class object i will use compare method. (Compare by name)
		nameWiseName.add(new PersonData(1111,"Alice",25));        // PersonData Class is Implements Comparator Interface
		nameWiseName.add(new PersonData(3333,"Ben",22));          // Using Comparator Interface we will use Multiple compareTo method access at a time
		nameWiseName.add(new PersonData(2222,"Chris",30)); 
		System.out.println("Using Comparator:" + "\n" + "Name Wise: " + nameWiseName);
		
		Set<PersonData> adharWiseName = new TreeSet<PersonData>(new AdharComparator()); // In Person Class object i will use compare method. (Compare by adharNo)
		adharWiseName.add(new PersonData(1111,"Alice",25));        // Person Class is Implements Comparator Interface
		adharWiseName.add(new PersonData(3333,"Ben",22));          // Using Comparator Interface we will use Multiple compare method access at a time
		adharWiseName.add(new PersonData(2222,"Chris",30)); 
		System.out.println("Adhar Wise: " + adharWiseName);
		
		Set<PersonData> ageWiseName = new TreeSet<PersonData>(new AgeComparator()); // In Person Class object i will use compare method. (Compare by age)
		ageWiseName.add(new PersonData(1111,"Alice",25));        // Person Class is Implements Comparator Interface
		ageWiseName.add(new PersonData(3333,"Ben",22));          // Using Comparator Interface we will use Multiple compare method access at a time
		ageWiseName.add(new PersonData(2222,"Chris",30)); 
		System.out.println("Age Wise: " + ageWiseName);
		
	}

}
