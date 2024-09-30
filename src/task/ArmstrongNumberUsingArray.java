package task;

import java.util.Scanner;

public class ArmstrongNumberUsingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value:");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is:");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);

		}

		armstrong(arr);                                     //using function
		sc.close();
	}

	private static void armstrong(int[] arr) {              //function
		int n;
		System.out.println("Armstrong Number is:");
		for (int i = 0; i < arr.length; i++) {
			n = arr[i];
			int sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum = sum + (r * r * r);
				n = n / 10;
			}

			if (arr[i] == sum)
				System.out.println(arr[i]);
			
		}
	}
}
