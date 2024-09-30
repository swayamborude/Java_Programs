package basicJava;

import java.util.Scanner;

public class Divisibleby {
	
	public void divisible() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:-");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println(num+" is Divisible by Both 3 & 5");
		}
		else if(num % 3 == 0) {
			System.out.println(num+" is Divisible by 3");
		}
		else if(num % 5 == 0) {
			System.out.println(num+" is Divisible by 5");
		}
		else {
			System.out.println("Number is not Divisible by 3 & 5");
		}
	}
	
	public static void main(String[] args) {
		
		Divisibleby db = new Divisibleby(); // create class name object
		db.divisible();                     // and then call the void function
		
		
	}
}