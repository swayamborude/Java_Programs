package basicJava;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character:-");
		char ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+" is an vowel");
		}
		else {
			System.out.println(ch+" is not vowel");
		}
		sc.close();
		
	}

}
