package array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		int matrix[][] = new int[5][3];
		Scanner sc = new Scanner(System.in);

		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				System.out.println("Enter Number:");
				matrix[rows][cols] = sc.nextInt();                      // Accept Number from User
			}
		}

		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				System.out.print(matrix[rows][cols] + "\t");            // Display Number
			}
			System.out.println();                                       //NextLine
		}

		int sum=0;
		System.out.println("Sum of Total Number:");
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int cols = 0; cols < matrix[rows].length; cols++) {
				sum+=matrix[rows][cols];                                //Sum of Number
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
