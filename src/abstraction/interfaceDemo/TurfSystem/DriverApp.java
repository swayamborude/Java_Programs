package abstraction.interfaceDemo.TurfSystem;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {

		System.out.println("-WELCOME TO CHAMPION TURF-");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Mobile Number:");
		long num = sc.nextLong();

		System.out.println("");
		System.out.println("Please select which Turf you want?");
		System.out.println("1.Cricket");
		System.out.println("2.Football");
		System.out.println("3.Tennis");
		System.out.println("0.Exit");

		int turfChoice = sc.nextInt();
		System.out.println("");

		Turf t = null; // Create reference for parent class
		double turfPrice = 0;
		String turfName = null;
		switch (turfChoice) {
		case 1:
			t = new CricketTurf();
			turfPrice = t.getTurfPrice();
			turfName = t.getTurfName();
			break;
		case 2:
			t = new FootballTurf();
			turfPrice = t.getTurfPrice();
			turfName = t.getTurfName();
			break;
		case 3:
			t = new TennisTurf();
			turfPrice = t.getTurfPrice();
			turfName = t.getTurfName();
			break;
		case 0:
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

		System.out.println(t.companyName());
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Mobile Number: " + num);
		System.out.println("Court Type: " + turfName);
		System.out.println("Court Price: " + turfPrice);

		System.out.println("Your Booking is Done!");
		System.out.println("Thank You for Choosing Champion Turf!");

	}

}
