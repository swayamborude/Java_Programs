package javaAssignmentExcelR.backend;

//		1. Write a program to cover all Java OOPS concepts. Topics need to cover: 
//		a)	Class and Object
//		b)	Class constructor
//	    c)	Method overloading
//	    d)	Method overriding
//	    e)	Inheritance
//	    f)	Interface
//	    g)	Abstract class

//Class and object
public class Student {

	String name;
	int rollNo;

// Class Constructor
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
// Method Overloading
	public void batch() {
		System.out.println("Student Batches");
	}
	
	public void batch(String batch) {
		System.out.println(name + " attend the " + batch + " Batch");
		System.out.println(name + " Roll No is " + rollNo);
		System.out.println();	}
	
// Abstract Class 
	public void attend() {
		System.out.println("Lecture Attending");
	}	

}

// Inheritance
class Alice extends Student{
	
	String guidedBy;

	public Alice(String name, int rollNo, String guidedBy) {
		super(name, rollNo);
		this.guidedBy=guidedBy;
	}
	
// Method overriding
	@Override
	public void batch() {
		System.out.println("Student Name: " + name );
	}
	
// Interface implement
	public void info() {
		System.out.println("Guided BY: " + guidedBy);
	}
	
}

// Interface
interface someInfo{
	void show();
}

class Ben extends Student implements someInfo	{

	public Ben(String name, int rollNo) {
		super(name, rollNo);
	}

	@Override
	public void batch() {
		System.out.println("Student Name: " + name);
		System.out.println(name + " is attend Data Science Batch");
		System.out.println(name + " Roll No is " + rollNo);
	}
	
	@Override
	public void show() {
		System.out.println(name + " Showing Info");
	}
}
	
// Abstract Class
	abstract class student1 {
		String role;
		
		public student1(String role) {
			this.role=role;
	}
		
// Abstract method
	abstract void age();
	
	public void info() {
		System.out.println("Role is: " + role);
	}	
	
}
	
	class Data_Engineer extends student1{

		public Data_Engineer() {
			super("Data_Engineer");
		}

		@Override
		void age() {
		}
	}