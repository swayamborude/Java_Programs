package exceptionHandling.userDefinedException;

public class NumberFormatExceptionDemo {
	
	public static void main(String[] args) {
		
		String sentence = "My name is Alice i have 1 brother and 3 sister i am 20.2 years old";
		String arr[]=sentence.split(" ");
		int intCounter=0;
		int doubleCount=0;
		for (String s:arr)
		{
			try
			{
			int x = Integer.parseInt(s);
			intCounter++;
			}
			catch(NumberFormatException e1) {
			
			   try
			   {
				   double y = Double.parseDouble(s); 
				   doubleCount++;
			   }
			   catch(NumberFormatException e2) {}
	
			}
		}
		System.out.println("Number of integer values are: " + intCounter);
		System.out.println("Number of non integer values are: " + (arr.length-intCounter));
		System.out.println("Number of double values are: " + doubleCount);
		System.out.println("Number of Total values in the String: " + (arr.length-intCounter+doubleCount));

		
	}

}
