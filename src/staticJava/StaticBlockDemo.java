package staticJava;

public class StaticBlockDemo {
	
	static
	{
		System.out.println("Variable");   // Static block executed before the main method
		
	}
	
	public static void main(String[] args) {
		
		display();                         // before main method the static block execute
		System.out.println("Static");
	}

	private static void display() {
		System.out.println("Block");
		
		
	}

}
