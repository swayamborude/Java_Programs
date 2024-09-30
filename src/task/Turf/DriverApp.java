package task.Turf;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String customerName = sc.next();
		System.out.println("Enter Mobile Number:");
		long mobNumber = sc.nextLong();
		
		System.out.println("");
		System.out.println("*-----Champion Turf-----*");
		System.out.println("Please select which Court you want?");
		System.out.println("1.Cricket");
		System.out.println("2.Football");
		System.out.println("3.Tennis");
		System.out.println("0.Exit");
		
		int turfChoice = sc.nextInt();
		System.out.println("");
		
		switch(turfChoice)
		{
		case 1:System.out.println("Customer Name: "+ customerName);
		       System.out.println("Customer Mobile Number: "+ mobNumber);
		       System.out.println("Court Type : Cricket");
		       System.out.println("Court Price : 700");
		       break;
		case 2:System.out.println("Customer Name: "+ customerName);
	           System.out.println("Customer Mobile Number: "+ mobNumber);
	           System.out.println("Court Type : Football");
	           System.out.println("Court Price : 800");
	           break;
		case 3:System.out.println("Customer Name: "+ customerName);
	           System.out.println("Customer Mobile Number: "+ mobNumber);
	           System.out.println("Court Type : Tennis");
	           System.out.println("Court Price : 1000");
	           break;
		case 0:System.exit(0);
		default:System.out.println("Invalid Choice..");
		}
		
		System.out.println("Thank You for Choosing Champion Turf.!");	
		sc.close();

	}

}
