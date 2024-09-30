package wrapperClass;

public class WrapperClassDemo {
	
	public static void main(String[] args) {
		
		int a = 10;              //primitive
		System.out.println("Primitve: "+a);
		
		Integer obj = new Integer(a);
		System.out.println("Non-Primitve Autoboxing: "+ obj);   //Autoboxing
		
		int b = obj.intValue();                          //Unboxing
		System.out.println("Primitive Unboxing: " + b);
		
		double x = 10.12;
		Double dobj = new Double(x);                     //Autoboxing
		System.out.println("Double Autoxing: " + dobj);
		
		double y = dobj.doubleValue();
		System.out.println("Double Unboxing: " + y);     //Unboxing
	}

}