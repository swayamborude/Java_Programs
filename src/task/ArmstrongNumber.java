package task;

//import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		armstrongNum(1000);
	}

	private static void armstrongNum(int limit) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number:");
//		int num = sc.nextInt();
//		
//		int r;
//		int sum=0;
//		int n =num;
//		
//		while(num>0)
//		{
//			r = num%10;                 
//			sum = sum + (r*r*r);
//			num = num/10;
//		}
//		if(sum==n)
//			System.out.println("Armstrong");
//		else
//			System.out.println("Not Armstrong");	
//	}

		System.out.println("In 1 to 1000 Armstrong Number is:");
		for (int i = 1; i <=limit ; i++) {
			int num = i;
			int r;
			int sum=0;
			
			while (num > 0)
			{
				r = num%10;
				sum = sum + (r*r*r);
				num = num/10;	
			}
			if(sum==i)
				System.out.println(i);
		}
	}
}