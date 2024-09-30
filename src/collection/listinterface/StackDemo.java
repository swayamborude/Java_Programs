package collection.listinterface;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);
		// Push the Element into the Stack
		System.out.println("Pop the Element from Stack"+stack.pop());  // 50
		// Remove the Last element from the stack because of Stack follows Last-In-First-Out
		System.out.println("After pop the element:- " + stack);
		
		System.out.println(stack.peek());
		// It return the top element of the stack without removing that element
		
		System.out.println(stack.empty());
		// Check stack is empty or not if empty it returns True
		

	}

}
