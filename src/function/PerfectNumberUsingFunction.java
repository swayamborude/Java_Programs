package function;

import java.util.Scanner;

public class PerfectNumberUsingFunction {
	
	public static void main(String[] args) {
		perfectNumber();
	}

	private static void perfectNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		
		if(sum==n)
			System.out.println("PERFECT");
		else
			System.out.println("NOT PERFECT");		
		sc.close();
	}
}