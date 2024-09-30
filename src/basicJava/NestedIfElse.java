package basicJava;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:- ");
		int amount = sc.nextInt();
		
		if(amount>=100000)
			System.out.println("Excellent");
		
		else if(amount>=75000)
			System.out.println("Very Good");
		
		else if(amount>=50000)
			System.out.println("Good");
		
		else if(amount>=25000)
			System.out.println("Ok");
		
		else
			System.out.println("Not Ok");
		
	}

}