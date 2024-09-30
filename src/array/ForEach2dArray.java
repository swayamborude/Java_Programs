package array;

import java.util.Scanner;

public class ForEach2dArray {

	public static void main(String[] args) {
		
		int matrix[][]=new int[2][2];
		Scanner sc = new Scanner(System.in);
		
		for(int rows=0; rows<matrix.length; rows++)
		{
			for(int cols=0; cols<matrix[rows].length; cols++)
			{
				System.out.println("Enter Number:");
				matrix[rows][cols]=sc.nextInt();      //Accept the number
			}
		}
		
		int sum=0;
		System.out.println("Array is:");
		for(int arr[]:matrix)
		{
			for(int n:arr)
			{
				sum+=n;                    //sum of total number
				System.out.print(n+"\t");  //Display sum of total number the number
			}
			System.out.println();
		}
		System.out.println("Total number of sum is: "+ sum);
		
		for(int arr[]:matrix)
		{
			int sumRow=0;
			for(int n:arr)
			{
				sumRow+=n;                  //sum of row wise number
			}
			System.out.println("Row wise Sum is: "+sumRow);  //Display sum of row wise number
		sc.close();
		}
	}
}