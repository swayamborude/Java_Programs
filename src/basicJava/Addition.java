package basicJava;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		System.out.println("Enter first Number:-");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second Number:-");
		int num2 = sc.nextInt();
		
		int add = num1+num2;
		System.out.println("Addition of Num1 and Num2 is:- "+add);
	    sc.close();

			
		} 
		
		
	}
