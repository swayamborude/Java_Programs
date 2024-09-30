package oops;

public class MainClassAndObject {
	
	public static void main(String[] args) {
		
		ClassAndObject player1 = new ClassAndObject();
		ClassAndObject player2 = new ClassAndObject();
		ClassAndObject player3 = new ClassAndObject();
		
		player1.acceptPlayer();
		player2.acceptPlayer();
		player3.acceptPlayer();
		
		player1.displayPlayer();
		System.out.println();
		player2.displayPlayer();
		System.out.println();
		player3.displayPlayer();
	}

}
