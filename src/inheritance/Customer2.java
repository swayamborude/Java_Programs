package inheritance;

public class Customer2 {
	
	public long adharNo;
	public String name;
	public String panCard;
	
	public Customer2()
	{
		this.adharNo=112233445566L;
		this.name="Swayam_Borude";
		this.panCard="SWEDV8536S";
	}
	
	public Customer2(long a, String b, String c)
	{
		this.adharNo=a;
		this.name=b;
		this.panCard=c;
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("Adhar No: "+adharNo);
		System.out.println("Name: "+name);
		System.out.println("Pan Card: "+panCard);	
	}

}
