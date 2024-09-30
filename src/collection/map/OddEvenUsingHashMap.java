package collection.map;

import java.util.HashMap;

public class OddEvenUsingHashMap {
	public static void main(String[] args) {
		
		int arr[] = {12,13,45,78,95};
		HashMap<String,Integer> oddeven = new HashMap<String,Integer>();
		oddeven.put("oddc", 0);
		oddeven.put("evenc", 0);
		
		for(int n: arr)
		{
			if(n % 2 == 0)
			{
				oddeven.put("evenc", oddeven.get("evenc")+1);
			}
			else
			{
				oddeven.put("oddc", oddeven.get("oddc")+1);
			}
		}
		System.out.println(oddeven);
		
	}

}
