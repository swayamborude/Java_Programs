package collection.listinterface;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingStack {
	
	public static void main(String[] args) {
		
		Stack<Character> stack = new Stack<Character>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String input = sc.next();
		String output="";
		for(char c: input .toCharArray())
		{
			stack.push(c);
		}
		while(!stack.isEmpty())
		{
			output=output.concat(String.valueOf(stack.pop()));
		}
		System.out.println(output);
		if(input.equals(output))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
	sc.close();
	}
	
}
