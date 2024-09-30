package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AthleteHashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Athlete> m100 = new HashMap<String,Athlete>();
		m100.put("first", new Athlete(18,"Virat",32, new Address(15,"15 Bund Garden","Opp Residency Club",411541)));
		m100.put("second", new Athlete(45,"Rohit",35, new Address(16,"16 Pune Camp","Opp FS",414879)));
		m100.put("third", new Athlete(77,"Shubhman",24, new Address(18,"18 Koregaon Park","Near by Agent Jack Club",411547)));
		System.out.println(m100);
		
		System.out.println(m100.get("second").getName()); // Rohit
		System.out.println(m100.keySet());                // it will return all keys like [third, first, second]
		
		HashMap<String,Athlete> m200 = new HashMap<String,Athlete>();
		m200.put("first", new Athlete(63,"Surya",32, new Address(20,"20 MG Road","Above Yeti Restaurant",411478)));
		m200.put("second", new Athlete(1,"Rahul",35, new Address(21,"21 FC Road","Above Boat Club",411254)));
		m200.put("third", new Athlete(17,"Rishabh",24, new Address(22,"22 JM Road","Above Conrad Club",411297)));
		System.out.println(m200.get("third").getName());  // Rishabh
		
		List<HashMap<String,Athlete>> olympics = new ArrayList<HashMap<String, Athlete>>(); 
		olympics.add(m100);
		olympics.add(m200);
		
		System.out.println(olympics.get(1).get("third").getName());  // Rishabh
		System.out.println(olympics.get(0).get("first").getAge());   // 32
		System.out.println(olympics.get(1).get("second").getAddress().getPinCode()); // 411254
		
		for(int i=0; i<olympics.size(); i++) // print the name who has come first in olympics
		{
			System.out.println(olympics.get(i).get("first").getName()); //Virat Surya
		}
	
		
	}

}
