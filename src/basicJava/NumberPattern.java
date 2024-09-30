package basicJava;

public class NumberPattern {

	public static void main(String[] args) {

		
		for(int i=1;i<=5;i++)            // outer loop - rows
		{
			for(int j=1;j<=i;j++)        // inner loop - columns
			{
				System.out.print(i+" ");
			}
		System.out.println();
			
		}

	}

}
