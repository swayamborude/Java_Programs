package exceptionHandling.userDefinedException.unchecked;

import java.util.Scanner;

public class LowQuantityExceptionDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Quantity:");
		int qty = sc.nextInt();
//		try                                    
//		{                                      
		orderproduct(qty);
		}
        // throws is used to delegate the exception exception handling to the caller method.
        // throw is used to the explicitly throw an exception , majority of the time used 
        // to the throw used defined Exception
	
//		catch(LowQuantityException e1)
//		{
//			System.out.println(e1);
//		}
//		finally {
//			System.out.println("Thank You!");
//		}

	private static void orderproduct(int qty) throws LowQuantityException {     // there are two ways to handle exception 1st is using throws keyword,
		
		try                                   // 2nd is write try and catch block
		{
		if (qty < 500)
			throw new LowQuantityException("Min order quantity is 500 units");
		else
			System.out.println("Order Delivered");
		}
		catch(LowQuantityException e2)
		{
			System.out.println(e2);
		}
		finally {
			System.out.println("Thank You!");
		}
		
	}
}
