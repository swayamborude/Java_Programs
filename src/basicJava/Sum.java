package basicJava;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args)
	{
		
		//Question:- take any number from user and display it and then these number of addition is
		//           gives the only single digit ? 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:- ");
		int n = sc.nextInt();
		
		while(n>9)
		{
			int sum = 0;
			int r = 0;
			
			while(n>0)
			{
				r = n%10;
				sum+=r;
				
				n=n/10;
			}
			n = sum;
			
		}
		System.out.println("Sum is:- "+ n);
		

	}

}
