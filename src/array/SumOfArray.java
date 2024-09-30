package array;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int size = sc.nextInt();
		int arr[] = new int[size]; // declare

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter a Value:");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of total number:-");
		System.out.println(sum);
		sc.close();

	}
}