package wrapperClass;

public class ConversionString {

	public static void main(String[] args) {
		
		int n =123;
		String s1 = String.valueOf(n);                           //Convert Integer into String
		System.out.println("String is: " + s1);
		System.out.println("String Length is: " + s1.length());  //String length
		
		String m = "1234";
		int i = Integer.parseInt(m);                             //Convert String into Integer
		System.out.println("Integer is: " + i);
		
	}

}
