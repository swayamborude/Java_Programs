package recursionfunction;

public class RecursionDemo {

	public static void main(String[] args) {

		int n = 5;
		int ans = sum(n);
		System.out.println(ans);
	}

	private static int sum(int n) {      //Call same function name

		if(n==1)                         //Base Case
		{
			return 1;
		}
		else
		{
			return n+sum(n-1);           //lesser value
		    //Call same function name
		}
	}
}