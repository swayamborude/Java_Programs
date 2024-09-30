package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		try
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int n = sc.nextInt();
		System.out.println("Enter Denominator:");
		int m = sc.nextInt();
		
		double result = n/m;
		System.out.println(result);
		
		int arr[]=new int[3];
		arr[4]=100;                   //some exception found
	
		
		}
//		catch(ArithmeticException e1)  //ArithmeticException
//		{
//			System.out.println("Denominator cannot be zero");
//		}
//		catch(InputMismatchException e2) //InputMismatchException
//		{
//			System.out.println("Please enter valid integer");
//		}
		
		catch(ArithmeticException | InputMismatchException e2)    //catch multiple exception in 1 catch block using pipe operator(|).
		{
			System.out.println("Enter valid input");
		}
		catch(Exception e3)         //default Exception
		{
			System.out.println("some exception found");
		}
		System.out.println("Hello");

	}
	     

}
