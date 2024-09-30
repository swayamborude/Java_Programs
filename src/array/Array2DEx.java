package array;

import java.util.Scanner;

public class Array2DEx {

	public static void main(String[] args) {

		int arr[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);

		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				System.out.println("Enter Number:");
				arr[rows][cols] = sc.nextInt();
			}

		}
		sc.close();
		matrix(arr);
	}

	private static void matrix(int arr[][]) {

		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				System.out.print(arr[rows][cols] + "\t");
			}
			System.out.println(" ");
		}

		int sum = 0;
		System.out.println("Sum of the above Array:");
		for (int rows = 0; rows < arr.length; rows++) {
			for (int cols = 0; cols < arr[rows].length; cols++) {
				sum += arr[rows][cols];
			}
		}
		System.out.println(sum);

		System.out.println("Maximum number each row:");

		for (int rows = 0; rows < arr.length; rows++) {
			int sum1=0;
			int max = arr[rows][0];
			for (int cols = 0; cols < arr[rows].length; cols++) {
				sum1+= arr[rows][cols];
				if (arr[rows][cols] > max) {
					max = arr[rows][cols];
				}
			}
			System.out.println("Row "+(rows+1)+"-"+"Sum is: "+sum1+" and"+" Max Number is: "+max);
		}

	}

}
