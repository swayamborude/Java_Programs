package basicJava;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		
		int i;
		int counter = 0;
		int loopCounter = 0;   
		
		for(i=1; i<=n; i++) 
		{
			loopCounter++;        //How many time the loop has iterated 
			                      //in that condition O(n) complexity use means How many time the loop has iterated
			if(n%i==0)
			{
			counter++;
			
			}
		}
		
		if(counter==2)
		{
			System.out.println("It's Prime Number");
		}
		else 
		{
			System.out.println("Not Prime Number");
		}	
		System.out.println("Iterations Count: "+loopCounter);
	}

}
