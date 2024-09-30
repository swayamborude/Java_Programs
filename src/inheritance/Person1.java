package inheritance;

public class Person1 {      //Super Class
	
	long adharNo;
	String name;
	int age;
	
	public Person1()
	{
		this.adharNo=112233445566L;
		this.name="Swayam";
		this.age=22;
	}
	
	public Person1(long a, String b, int c)
	{
		this.adharNo=a;
		this.name=b;
		this.age=c;
	}
	
	public void displayPersonalDetails()
	{
		System.out.println("Adhar No: "+ this.adharNo);
		System.out.println("Name : "+ this.name);
		System.out.println("Age : "+ this.age);
	}

}
