package abstraction.interfaceDemo;

public abstract class Rectangle implements Shape {
	
	//Class implements interface
	
	//This class become Abstract class because,
	//this class does not override all abstract method,
	//in this class one method is abstract method (void parameter())
	
	@Override 
	public void area()                    //Override method
	{
		System.out.println("Area");
	}
	
	void test()                           //create his own method
	{
		System.out.println("Test");
	}
	
	void displayRadius()
	{
		System.out.println(RADIUS);
	}


}
