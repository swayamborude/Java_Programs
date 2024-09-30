package inheritance.copy;

public class Account2Driver {

	public static void main(String[] args) {
	
	Account2 data = new Account2();
	data.displayAccountDetails();
	
	System.out.println();
	
	Account2 data1 = new Account2(11111122222L,"SB","Swwdndn55","Current",12000,"BOI");
	data1.displayAccountDetails();
	
		
	}
}
