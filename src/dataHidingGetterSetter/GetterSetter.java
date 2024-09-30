package dataHidingGetterSetter;

public class GetterSetter {

	public int accNumber;
	public String IFSC;
	public String bankName;
	public String branchName;
	
	private double balance;             // Data Hiding
	private int atmpin;                 // Data Hiding
	
	public void setBalance(double x)    // setter method of balance;
	{
		this.balance=x;
	}
	public double getBalance()          // getter method of balance;
	{
		return this.balance;	
	}
	 
	public void setAtmpin(int y)        // setter method of atmpin;
	{
		this.atmpin=y;
	}
	public double getAtmpin()           // getter method of atmpin;
	{
		return this.atmpin;
	}
	
}
