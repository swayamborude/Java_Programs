package basicJava;

public class AddNum {

	public static void main(String[] args) {

		int n = 123;
		int r;
		int sum = 0;
		
		while(n>0) {
			
			r = n%10;
			
			sum = sum + r;
			
			n = n / 10; 
		}
		System.out.println(sum);

		

	}

}
