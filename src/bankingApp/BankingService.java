package bankingApp;

public interface BankingService {
	
	public double getBalance();
	public void deposit(double dAMT);
	public void withdraw(double wAMT);
	public void fundTransfer();

}
