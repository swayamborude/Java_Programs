package override.Ex1;

public class Abhishek extends Amitabh {
	
	public void car()
	{
		System.out.println("Audi");
	}
	
	@Override
	public void home() //Override means writing a function with the same name and same parameter in the sub class
	{
		System.out.println("New Jalsa");
	}

}
