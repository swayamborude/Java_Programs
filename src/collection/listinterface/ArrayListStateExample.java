package collection.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStateExample {

	public static void main(String[] args) {
		
		List<String> mh = new ArrayList<String>();
		mh.add("Pune");
		mh.add("Delhi");
		mh.add("Mumbai"); 
		System.out.println("Maharashtra's City: " + mh);  // Maharashtra's City: [Pune, Delhi, Mumbai]
		System.out.println("Does MH Contain Mumbai?: " + mh.contains("Mumbai")); // true
		System.out.println("Does MH Contain Kota?: " + mh.contains("Kota")  + "\n"); // false
		
		List<String> rj = new ArrayList<String>();
		rj.add("Jaipur");
		rj.add("Fatehpur");
		rj.add("Kota");
		System.out.println("Rajasthan's City: " + rj);    // Rajasthan's City: [Jaipur, Fatehpur, Kota]
		System.out.println("Does RJ Contain Mumbai?: " + rj.contains("Mumbai")); // false
		System.out.println("Does RJ Contain Kota?: " + rj.contains("Kota")  + "\n"); // true
		
		List<List<String>> india = new ArrayList<List<String>>();   //List<List<String>> is a list where each element is itself a list of String elements.
		india.add(mh);
		india.add(rj);
		System.out.println("*India's City: " + india + "\n");     // India's City: [[Pune, Delhi, Mumbai], [Jaipur, Fatehpur, Kota]]
		
//		System.out.println("In Maharashtra 0th Index City is: " + mh.get(0));  // In Maharashtra 0th Index City is: Pune
//		System.out.println("In Rajasthan 1st Index City is: " + rj.get(1));    // In Rajasthan 1st Index City is: Fatehpur
//		System.out.println("In India 0th Index Cities is: " + india.get(0));   // In India 0th Index Cities is: [Pune, Delhi, Mumbai]
		
		List<String> alaska = new ArrayList<String>();
		alaska.add("New York");
		alaska.add("New Jersey");
		alaska.add("California");
		System.out.println("Alaska City: " + alaska);  // Alaska City: [New York, New Jersey, California]
		
		List<String> texas = new ArrayList<String>();
		texas.add("Washington");
		texas.add("New Orleans");
		texas.add("Hollywood");
		System.out.println("Texas City: " + texas);    // Texas City: [Washington, New Orleans, Hollywood]
		
		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(alaska);
		USA.add(texas);
		System.out.println("*USA Cities: " + USA + "\n"); // *USA Cities: [[New York, New Jersey, California], [Washington, New Orleans, Hollywood]]
		
		List<List<List<String>>>  earth = new ArrayList<List<List<String>>>();
		earth.add(india);
		earth.add(USA);
		System.out.println("*In Earth Cities: " + earth + "\n");
		//*In Earth Cities: [[[Pune, Delhi, Mumbai], [Jaipur, Fatehpur, Kota]], [[New York, New Jersey, California], [Washington, New Orleans, Hollywood]]]
		
		System.out.println(mh.get(0)); //Pune
		System.out.println(india.get(0).get(0)); //Pune
		System.out.println(earth.get(0).get(0).get(0));  //Pune
		
		System.out.println(alaska.get(1)); // New Jersey
		System.out.println(USA.get(0).get(1));  // New Jersey
		System.out.println(earth.get(1).get(0).get(1));  // New Jersey
		
		List<String> AlaskaState = earth.get(1).get(0);
		System.out.println("Alaska State: " + AlaskaState); // Alaska State: [New York, New Jersey, California]
		
	}

}
