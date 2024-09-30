package exceptionHandling;

public class Person1 implements Cloneable {  
	
	private long adharNo;
	private String name;
	private int age;
	
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

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person1 [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}
	
}
