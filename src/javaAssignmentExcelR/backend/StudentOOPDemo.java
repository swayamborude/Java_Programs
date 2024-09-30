package javaAssignmentExcelR.backend;

public class StudentOOPDemo {
	
	public static void main(String[] args) {
		
		// Class And Object
		
		Alice alice = new Alice ("Alice",111,"Umar_Sir");
		alice.batch();                   // Method Overloading
		alice.info();                    // Inheritance
		alice.batch("Java Full Stack");  // Method Overriding
		
		// Interface
		
		Ben ben = new Ben ("Ben",222);
		ben.batch();                     // Method Overriding
		//ben.show();                    // Interface Method
		
		
		// Abstract Class
		
		Data_Engineer tom = new Data_Engineer();
		tom.age();
		tom.info();
	}

}
