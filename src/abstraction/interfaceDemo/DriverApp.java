package abstraction.interfaceDemo;

public class DriverApp {
	
	public static void main(String[] args) {
		
		//In this class i will create a object, i create a object FootballFiled class because,
		//FootballFiled class is concrete class.
		//Interface and Abstract class does not make object.
		//object create only concrete class.
		
		Shape s1 =new FootballField();
		s1.area();      
		s1.perimeter();
		
		System.out.println("****");
		
		Rectangle s2 =new FootballField();
		s2.area();                          //This is override method call
		s2.perimeter();                     
		s2.test();                          //This is Own method call
		s2.displayRadius();                 //RADIUS value
		
		System.out.println("****");
		
		FootballField s3 =new FootballField();
		s3.area();
		s3.perimeter();                    //This is override method call
		s3.test();
		s3.display();
	}

}
