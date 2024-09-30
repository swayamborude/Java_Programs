package function;

import java.util.Scanner;

public class FunctionScenario2 {
	
	public static void main(String[] args) {
		int result;
		result = areaRect();
		System.out.println("Area of Reactangle: "+result);
		
	}

	private static int areaRect() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length:");
		int length = sc.nextInt();
		System.out.println("Enter Length:");
		int breadth = sc.nextInt();
		
		int ans = length*breadth;
		
		return(ans);		
	}
}