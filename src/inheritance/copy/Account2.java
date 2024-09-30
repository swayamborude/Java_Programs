package inheritance.copy;

public class Account2 extends Customer2 {
	
	public String accountType;
	public int balance;
	public String bankName;
	
	public Account2()
	{
		super();
		this.accountType="Saving";
		this.balance=5000;
		this.bankName="HDFC";
	}
	
	public Account2(long a, String b, String c, String d, int e, String f)
	{
		super(a,b,c);
		this.accountType=d;
		this.balance=e;
		this.bankName=f;
	}
	
	public void displayAccountDetails()
	{
		super.displayCustomerDetails();
		System.out.println("Account Type: "+ accountType);
		System.out.println("Balance: "+ balance);
		System.out.println("Bank Name: "+ bankName);
	}

}
