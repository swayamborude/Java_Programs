package recursionfunction;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		int n = 5;
		int ans = factorial(n);
		System.out.println(ans);
	}

	private static int factorial(int n) {      //Call same function name

		if(n==1)                         //Base Case
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);           //lesser value
		    //Call same function name
		}
	}
}