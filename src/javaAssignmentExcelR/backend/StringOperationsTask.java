package javaAssignmentExcelR.backend;

import java.util.Scanner;

public class StringOperationsTask {

	public static void main(String[] args) {

//    2.Design a Java program that performs various string operations and uses control statements for
//		user input validation. The program should allow the user to perform the following operations:

//		a)	Extract Substring: The user can enter a string and specify the starting and ending index,
//          and the program should extract and display the substring.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String Value: ");
		String string = sc.nextLine();

		System.out.println("Enter Starting Index: ");
		int startIndex = sc.nextInt();

		System.out.println("Enter Ending Index: ");
		int endIndex = sc.nextInt();
		
		sc.nextLine();

		if (startIndex >= 0 && endIndex <= string.length() && startIndex < endIndex) {
			String extractedSubstring = string.substring(startIndex, endIndex);

			System.out.println("Extracted Substring is: " + extractedSubstring + "\n");

		} else {
			System.out.println("Invalid Indices, Check Starting Index and Ending Index" + "\n");
		}

//      b)  Split a Sentence: The user can enter a sentence, and the program should split it into words and display them.

		System.out.println("Enter Sentence: ");
		String sentence = sc.nextLine();

		String[] words = sentence.split("\\s+"); // Split the spaces
		
		System.out.println("Sentence Split into Words");
		for (String word : words) {
			System.out.println(word);
		}
		sc.close();

	}
}
