package bankingApp;

import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {

		Customer customer = new Customer("Swayam","swayam@123");
		HDFCBank bank = new HDFCBank();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter Username:");
		String un = sc.next();
		System.out.println("Enter Password:");
		String pw = sc.next();
		boolean loginResult=customer.login(un, pw);
		
		if(loginResult==true)
		{
			System.out.println("\n**Welcome To HDFC Bank**");
			do
			{
			System.out.println("\nBanking Service");
			System.out.println("1.Check Balance");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposit");
			System.out.println("4.Fund Transfer");
			System.out.println("5.Exit");
			
			System.out.println("\nEnter Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: double balance = bank.getBalance();
			        System.out.println("Your Current Balance is :" + balance);
			        break;
			        
			case 2: System.out.println("Enter Withdraw Amount");
			        double wAMT=sc.nextDouble();
			        bank.withdraw(wAMT);
			        break;
			        
			
			case 3: System.out.println("Enter Deposit Amount");
	                double dAMT=sc.nextDouble();
	                bank.deposit(dAMT);
	                break;
	                
			case 4: bank.fundTransfer();
		           	break;
		           	
			case 5: System.exit(0);
			
			default : System.out.println("Invaid Input");
			        
			}	
			}while(choice!=5);
		}
		else {
			System.out.println("Invalid Customer");
		}
		sc.close();
		
		

	}

}
