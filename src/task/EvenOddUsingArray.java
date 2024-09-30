package task;

public class EvenOddUsingArray {

	public static void main(String[] args) {

		int numbers[] = {12,15,14,58,45};

		int evenCount = 0;
		int oddCount = 0;

			for (int number : numbers)
				if (number % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
		System.out.println("Number of even numbers: " + evenCount);
		System.out.println("Number of odd numbers: " + oddCount);

	}

}
