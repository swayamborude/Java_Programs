package inheritance;

public class Employee1 extends Person1 {     //Super Class = Person1
	                                         //Sub Class = Employee1                         
	public int empNo;
	public String desg;
	public double salary;
	
	public Employee1()                      // No args Constructor
	{
		super();                            //Constructor of subclass calling constructor of Super class
		this.empNo=123;
		this.desg="Admin";
		this.salary=1234;
	}
	
	public Employee1(long a, String b, int c, int d, String e, double f)
	{                                       // Parameterized Constructor
		super(a,b,c);
		this.empNo=d;
		this.desg=e;
		this.salary=f;	
	}
	
	public void displayEmployeeDetails()    // Regular Function
	{
		super.displayPersonalDetails();     //Regular Function calling Regular Function of Super Class
		System.out.println("Emp No: "+ this.empNo);
		System.out.println("Designation: "+ this.desg);
		System.out.println("Salary: "+ this.salary);
		
	}

}
