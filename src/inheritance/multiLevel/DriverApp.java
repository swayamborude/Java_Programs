package inheritance.multiLevel;

public class DriverApp {
	
	public static void main(String[] args) {
		
		Amitabh a1;         //Reference
		Abhishek a2;
		Aradhya a3;
		
		a1 = new Aradhya();
		a1.home();
		
		System.out.println("****");
		
		a2 = new Aradhya();
		a2.home();
		a2.car();
		a2.hotel();
		
		System.out.println("****");
		
		a3 = new Aradhya();
		a3.home();
		a3.car();
		a3.hotel();
		a3.office();
		
	}

}
