package function;

public class BasicFunctionEx {

	public static void main(String[] args) {

		System.out.println("I am in main");              //1
		brazil();
		System.out.println("Finally I'm Back in Main");  //5
	}

	private static void brazil() {
		
		System.out.println("I am in Brazil");            //2
		argentina();
		System.out.println("I am Back in Brazil");       //4
		
	}

	private static void argentina() {

		System.out.println("i am in Argentina");         //3
		
	}

}
