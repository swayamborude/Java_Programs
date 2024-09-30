package array;

import java.util.Scanner;

public class EvenNumUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Value:");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();

		evenNum(arr);
	}

	private static void evenNum(int[] arr) {

		int n;
		for (int i = 0; i < arr.length; i++) {
			
			n = arr[i];
			if (n % 2 == 0) {
				System.out.println("In above Array Even Number is:");
				System.out.println(arr[i]);
			}

		}

	}
}
