package exceptionHandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[2];
		try
		{
		System.out.println("Enter value of 0th Index:");
		arr[0] = sc.nextInt();
		System.out.println("Enter value of 1th Index:");
		arr[1] = sc.nextInt();
		
		    try 
		    {
		    	System.out.println("Enter index of Numerator:");
		    	int n = sc.nextInt();
		    	System.out.println("Enter index of Denominator:");
		    	int d = sc.nextInt();
		    	double result = arr[n]/arr[d];
		    	System.out.println(result);
		    }
		    catch(ArrayIndexOutOfBoundsException e1)
		    {
		    	System.out.println("Please enter valid index 0 and 1 only");    	
		    }
		    
		    catch(ArithmeticException e2)
		    {
		    	System.out.println("Denominator cannot be zero");    	
		    }
		
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter interger values only");
		}
		
				
		System.out.println(Arrays.toString(arr));       //Print the array

		
	}

}
