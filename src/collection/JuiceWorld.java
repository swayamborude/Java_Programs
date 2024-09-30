package collection;

import java.util.Scanner;

public class JuiceWorld {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Mango Juices:");
		int mangoJuice=sc.nextInt();
		System.out.println("Enter Number of PineApple Juices:");
		int pineAppleJuice=sc.nextInt();
		System.out.println("Enter Number of Sugarcane Juices:");
		int sugarcaneJuice=sc.nextInt();
		
		MinimumTimeofJuice mt = new MinimumTimeofJuice();
		int minimumTime = mt.calculateMinimumTime(mangoJuice,pineAppleJuice,sugarcaneJuice);
		System.out.println("Minimum time taken to prepare the order is " + minimumTime + " seconds");

		sc.close();
	}

}
