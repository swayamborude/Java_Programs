package task;

import java.util.Scanner;

public class ChatbotUsingNestedSwitch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**Menu**");
		System.out.println("1.Pizza");
		System.out.println("2.Burger");
		System.out.println("3.Fries");
		System.out.println("");
		System.out.println("**Please Enter your Order**");
		
		int order = sc.nextInt();
		
		switch(order) 
		{
		case 1:
			System.out.println("");
			System.out.println("1.Veg");
			System.out.println("2.Non-Veg");
			
			int type = sc.nextInt();
			
			switch(type) 
			{
			case 1:
				System.out.println("");
				System.out.println("1.Margherita");
				System.out.println("2.Onion");
				System.out.println("3.Capsicum");
				System.out.println("4.Sweet Corn");
				System.out.println("5.Mashroom");				
				
				int choose = sc.nextInt();
				
				switch(choose) {
				
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("");
					System.out.println("**Please Enter the Size**");
					System.out.println("1.small");
					System.out.println("2.medium");
					System.out.println("3.large");
					
					int size = sc.nextInt();
					
					switch(size) 
					{
					case 1:
					case 2:
					case 3:
					System.out.println("");
					System.out.println("Your Order has been Done");
					System.out.println("Thank You!");
			     	break;
				    }
				}
			break;
				
			case 2:
				System.out.println("");
				System.out.println("1.Chicken Mexicana");
				System.out.println("2.Chicken Sausage");
				
				int choose1 = sc.nextInt();
				
				switch(choose1)
				{
				
				 case 1:
				 case 2:
					System.out.println("");
					System.out.println("**Please Enter the Size**");
					System.out.println("Small");
					System.out.println("Medium");
					System.out.println("Large");
					
					int size1 = sc.nextInt();
					
					switch(size1) 
					{
					case 1:
					case 2:
					case 3:

					System.out.println("");
					System.out.println("Your Order has been Done");
					System.out.println("Thank You!");
					break;
		        	}
					sc.close();
		
		    	}	
		
		   }
		
		}
	}
}
