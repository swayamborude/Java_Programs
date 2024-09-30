package inheritance;

public class Employee1Driver {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(); 
		e1.displayEmployeeDetails();
		//This is call from no-args constructor
		
		System.out.println();
		
		Employee1 e2 = new Employee1(123456789L, "Rohit", 23,2547,"Manager", 120121);
		e2.displayEmployeeDetails();
		//This is call from args Constructor

	}

}
