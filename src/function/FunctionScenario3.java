package function;

import java.util.Scanner;

public class FunctionScenario3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int length = sc.nextInt();
		System.out.println("Enter Length:");
		int breadth = sc.nextInt();
		
		int result = areaRect(length,breadth);
		System.out.println("Area of Rectangle: "+result);
	}

	private static int areaRect(int length, int breadth) {
		
		int ans = length*breadth;
		return ans;
	}
}