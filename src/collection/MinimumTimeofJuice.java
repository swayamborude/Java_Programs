package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinimumTimeofJuice {
	
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

	public int calculateMinimumTime(int mangoJuice, int pineAppleJuice, int sugarcaneJuice)
	{
		pq.add(mangoJuice);
		pq.add(pineAppleJuice);
		pq.add(sugarcaneJuice);
		int seconds=0;
		
		int j1,j2;
		Iterator<Integer> itr = pq.iterator();
		while(!pq.isEmpty())
		{
			j1=0;
			j2=0;
			
			if(itr.hasNext())
			{
				j1=pq.remove();
			}
			
			if(itr.hasNext())
			{
				j2=pq.remove();
			}
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;
			}
			
//			if(j1==0 && j2>0)
//			{
//				seconds+=j2;
//				break;
//			}
			
			if(j1>0 && j2>0)
			{
				seconds++;
				j1--;
				j2--;
			}
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
		}
		return seconds;
	}

}
