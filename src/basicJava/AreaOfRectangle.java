package basicJava;

import java.util.Scanner;

public class AreaOfRectangle {
	
	public static void main(String[] args) {
		
		float result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		System.out.print("Enter length:-");
		float length = sc.nextFloat();
		
		System.out.print("Enter Width:-");
		float width = sc.nextFloat();
		
		result = length*width;
		System.out.println("Your Calulation is:-"+result);
	    sc.close();

		
	}

}
