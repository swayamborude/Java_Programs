package exceptionHandling;

public class Person1CloneableDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	Person1 p1 = new Person1(123123123L,"Alice",22);
//	Person1 p2=p1;                                    //Shallow Copy
//	p2.setName("Ben");
//	System.out.println(p1);
	
	Person1 p2 = (Person1) p1.clone();                //Deep Copy
	p2.setName("Ben");
	System.out.println(p1);
	
	
	}

}
