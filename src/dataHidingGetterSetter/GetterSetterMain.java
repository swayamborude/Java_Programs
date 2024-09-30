package dataHidingGetterSetter;

public class GetterSetterMain {

	public static void main(String[] args) {
		
		GetterSetter account = new GetterSetter();
		
		account.accNumber=123456;
		account.IFSC="AB12345";
		account.bankName="HDFC";
		account.branchName="Pune";
		
		account.setBalance(1000);
		account.setAtmpin(1234);
		
		System.out.println("Account Number: "+account.accNumber);
		System.out.println("IFSC Code: "+account.IFSC);
		System.out.println("Bank Name: "+account.bankName);
		System.out.println("Branch Name: "+account.branchName);
		
		System.out.println("Account Balance: "+account.getBalance());
		System.out.println("ATM Pin: "+account.getAtmpin());

	}

}
