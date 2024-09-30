package exceptionHandling.userDefinedException.checked;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int num = sc.nextInt();
		System.out.println("Enter Denominator:");
		int den = sc.nextInt();
		
        // throws is used to delegate the exception exception handling to the caller method.
        // throw is used to the explicitly throw an exception , majority of the time used 
        // to the throw used defined Exception
		
		try
		{
	    double result = divide(num,den);
	    System.out.println("Result is: " +result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1);
		} 
		catch(InputMismatchException e2)
		{
			System.out.println(e2);
		}
		sc.close();
		
	}

	private static double divide(int num, int den) throws ArithmeticException,InputMismatchException {
	return num/den;   //core business logic 
	}
	
}
