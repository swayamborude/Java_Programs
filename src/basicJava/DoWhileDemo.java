package basicJava;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Number:-");
		int n1 = sc.nextInt();
		System.out.println("Enter second Number:-");
		int n2 = sc.nextInt();
		
		int choice;
		
		do
		{
			System.out.println("\n" + "1.Addition" + "\n" + "2.Multiplication" + "\n" + "3.Substraction" + "\n" + "4.Division" + "\n" + "0.Exit");
			System.out.println("\n" + "Enter your Choice:-");
			choice = sc.nextInt();
			
			double result;
			
			switch(choice)
			{
			case 1:
				result = n1+n2;
				System.out.println("Addition is "+ result);
				break;
				
			case 2:
				result = n1*n2;
				System.out.println("Multiplication is "+ result);
				break;
				
			case 3:
				result = n1-n2;
				System.out.println("Substraction is "+ result);
				break;
			
			case 4:
				result = n1/n2;
				System.out.println("Division is "+ result);
				break;
				
			case 0:
				System.out.println("System Shutdown.."); System.exit(0);
				
			default:System.out.println("Invalid Choice..");
			
			}
			
		}while(choice!=0);	}

}
