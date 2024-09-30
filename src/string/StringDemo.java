package string;

import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String name = sc.next();
		
		int counterA=0;
		for(int i=0;i<name.length();i++) {     //length function
			if(name.charAt(i)=='a' || name.charAt(i)=='A') {   //charAt Index Position
				counterA++;
			}
		}
		System.out.println("Count of A in the String is: "+ counterA);	
	}

}
