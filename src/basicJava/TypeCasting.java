package basicJava;

public class TypeCasting {

	public static void main(String[] args) {
		
		int price = 10;
		double newPrice = price;     // I have used the Widening type
		
		System.out.println(price);
		System.out.println("Widening:-"+newPrice);
		
		double price1 = 10.75;
		int newPrice1 = (int)price1;
		
		System.out.println(price1);
		System.out.println("Narrowing:-"+newPrice1); // I have used the Narrowing type

	}

}
