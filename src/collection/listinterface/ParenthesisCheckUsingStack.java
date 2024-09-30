package collection.listinterface;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisCheckUsingStack {
	
	 public static boolean isWellFormed(String input) {
		
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the input string
        for (char c : input.toCharArray()) {
            // Push opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check for corresponding closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                // Check if stack is empty or doesn't match the corresponding opening bracket
                if (stack.isEmpty()) {
                    return false; // No opening bracket to match the closing one
                }

                char top = stack.pop(); // Pop the top of the stack
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false; // Brackets do not match
                }
            }
        }

        // Return true if stack is empty, meaning all opening brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String input = sc.nextLine();

        // Check if the parentheses are well-formed
        if (isWellFormed(input)) {
            System.out.println("The parentheses are well-formed.");
        } else {
            System.out.println("The parentheses are not well-formed.");
        }

        sc.close();
    }

}
