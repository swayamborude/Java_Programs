package basicJava;

import java.util.Scanner;

public class DemoIfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.English");
		System.out.println("2.Hindi");
		System.out.println("3.Marathi");
		
		System.out.println("Enter your Choice:-");
		int choice = sc.nextInt();
		
		if(choice == 1)
			System.out.println("Call routed to London");
		
		else if(choice == 2)
			System.out.println("Call routed to Delhi");
		
		else if(choice == 3)
			System.out.println("Call routed to Pune");
		    
		else {
			System.out.println("Invalid Input");
		}
		    System.out.println("Good Luck.!");
		    
		    sc.close();
	}
}
