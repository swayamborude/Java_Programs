package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> hash = new HashMap<Integer,String>();
		hash.put(1, "Alice");
		hash.put(1, "Ben");
		hash.put(1, "Chris");
		
		System.out.println(hash);
		System.out.println(hash.size());
		
	}
}
