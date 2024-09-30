package bankingApp;

import java.util.Scanner;

public class HDFCBank implements BankingService {

	private double balance;
	
	public HDFCBank()
	{
		this.balance=5000;
	}
	
	
	@Override
	public double getBalance() {
		return this.balance;	
	}

	@Override
	public void deposit(double dAMT) {
		this.balance = this.balance+dAMT;
		System.out.println("Deposit Successful");
		
	}

	@Override
	public void withdraw(double wAMT) {
		this.balance = this.balance-wAMT;
		System.out.println("Withdraw Successful");
		
	}

	@Override
	public void fundTransfer() {
		Scanner sc = new Scanner((System.in));
		RandomNumberGenerator otpGenerator = new RandomNumberGenerator();
		int otp=otpGenerator.getSixDigitOTP();
		System.out.println("SMS :"+otp);
		
		System.out.println("Enter OTP:");
		int userOtp=sc.nextInt();
		if(userOtp==otp)
		{
			System.out.println("Enter Amount To Transfer:");
			double tAMT=sc.nextDouble();
//			this.balance=this.balance-tAMT;
//			System.out.println("Transfer Successful");
//			
	           if (tAMT <= this.balance) {
	                this.balance -= tAMT;
	                System.out.println("Transfer Successful");
	            } else {
	                System.out.println("Insufficient Balance");
	            }
		}
		else
		{
			System.out.println("Invalid OTP");
		}
		sc.close();
		
	}

}
