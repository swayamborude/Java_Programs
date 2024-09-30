package collection.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionMethods2 {

	public static void main(String[] args) {
		
		List<String> mh = new ArrayList<String>(Arrays.asList("Pune","Mumbai"));
		System.out.println("Maharashtra City: " + mh); // Maharashtra City: [Pune, Mumbai]
		
		List<String> rj = new ArrayList<String>(Arrays.asList("Jaipur","Kota"));
		System.out.println("Rajasthan City: " + rj);  // Rajasthan City: [Jaipur, Kota]
		
		List<String> mp = new ArrayList<String>(Arrays.asList("Indore","Gwaliar"));
		System.out.println("Madhyapradesh City: " + mp);
		
		List<String> india = new ArrayList<String>();
		india.addAll(mh); //It is used to insert the specified collection elements in the invoking collection.
		india.addAll(rj);
		india.addAll(mp);
		System.out.println("India Cities: " + india + "\n");  // India Cities: [Pune, Mumbai, Jaipur, Kota]
		
		System.out.println("Does India contain the whole MH?: " + india.containsAll(mh)); // true
		mh.add("Pimpri");
		System.out.println("Does India contain the whole MH?: " + india.containsAll(mh)); // false
		india.add("Pimpri");
		System.out.println("Does India contain the whole MH?: " + india.containsAll(mh) + "\n"); // true

		System.out.println("India Cities: " + india); // India Cities: [Pune, Mumbai, Jaipur, Kota, Indore, Gwaliar, Pimpri]
		india.removeAll(mp);                          // It is used to delete all the elements of the specified collection from the invoking collection.
		System.out.println("India Cities: " + india); // India Cities: [Pune, Mumbai, Jaipur, Kota, Pimpri]
		india.retainAll(mh);                          // It is used to delete all the elements of invoking collection except the specified collection.
		System.out.println("India Cities: " + india); // India Cities: [Pune, Mumbai, Pimpri]
		
		System.out.println(india.containsAll(mh)); // It is used to search the specified collection in the collection // true	
	}
}
