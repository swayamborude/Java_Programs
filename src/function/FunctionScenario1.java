package function;

import java.util.Scanner;

public class FunctionScenario1 {

	public static void main(String[] args) {	
		areaReact();
	}

	private static void areaReact() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int length = sc.nextInt();
		System.out.println("Enter Breadth:");
		int breadth = sc.nextInt();
		
		int ans = length*breadth;
		System.out.println("Area of Reactangle is: "+ans);
		
		sc.close();
		
	}

}
