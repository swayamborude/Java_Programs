package task;

public class EvenOddMobiNumArray {

	public static void main(String[] args) {

		System.out.println("**Array is Given Below**");
		System.out.print("Array: ");
		long mobile[] = { 7040715511L, 8432707038L, 9356761302L, 9028233934L, 9356442796L }; //Accept Number

		for (int i = 0; i < mobile.length; i++) {
			System.out.print(mobile[i] + ",");    // Display Mobile Number
		}
		
		System.out.println("");
		for (int i = 0; i < mobile.length; i++) {
			long n = mobile[i];
			int oddCount = 0;
			int evenCount = 0;
			int r;
			while (n > 0) {
				r = (int) (n % 10);
				if (r % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
				n = n / 10;
			}
			
			if (evenCount > oddCount)
				System.out.println("Number " + (i + 1) + " which is " + mobile[i] + " has " + oddCount + " Odd Digits"
						+ " has " + evenCount + " Even Digits" + " It is EvenBiased Number");

			else if (evenCount < oddCount)
				System.out.println("Number " + (i + 1) + " which is " + mobile[i] + " has " + oddCount + " Odd Digits"
						+ " has " + evenCount + " Even Digits" + " It is OddBiased Number");

			else
				System.out.println("Number " + (i + 1) + " which is " + mobile[i] + " has " + oddCount + " Odd Digits"
						+ " has " + evenCount + " Even Digits" + " It is Neutral Number");
		}

	}

}
