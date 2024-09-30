package basicJava;

import java.util.Scanner;

public class PizzaOrder {
	public static void main(String[] args) {
		
		final int pizzaPrice=100;
		final int burgerPrice=80;
		final int friesPrice=50;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your order");
		
		System.out.print("How many Pizza's you have order:-");		
		int pizzaQuantity = sc.nextInt();
		
		System.out.print("How many Burger's you have order:-");
		int burgerQuantity = sc.nextInt();
		
		System.out.print("How many Fries you have order:-");
		int friesQuantity = sc.nextInt();
		
		int Bill = (pizzaPrice*pizzaQuantity)+(burgerPrice*burgerQuantity)+(friesPrice*friesQuantity);
		System.out.println("Your Total Bill is:-"+Bill);
		
		sc.close();
		
	}

}