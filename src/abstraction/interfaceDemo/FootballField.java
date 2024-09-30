package abstraction.interfaceDemo;

public class FootballField extends Rectangle {
	
	//Class(FootballField) extends Class(Rectangle)
	
	//Now its become concrete class because,
	//in this class that has an implementation all methods.

	@Override
	public void perimeter() {
		System.out.println("Football");
		
	}
	
	public void display()
	{
		System.out.println("Display");
	}
	
}
