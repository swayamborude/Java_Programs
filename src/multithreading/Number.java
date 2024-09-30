package multithreading;

public class Number extends Thread {         // extend the thread class because i will perform multithreading
	
	@Override
	public void run() {                      // override the run() method because run method already present in thread class
		                                     // in that case i have two run() method - 1st is make my own and 2nd is Thread class run() method. 
		for(int i = 1; i<=10; i++) {
			System.out.println("Number " + i);
		}
	}
	
//	@Override
//		public void start() {                 // QUE- CAN THE START METHOD BE OVERRIDDEN?
//                                            // ANS- YES, BUT NOT RECOMMENDED.
//			for(int j = 1; j<=5; j++)
//			{
//				System.out.println("Start " + j);
//			}
//		}

}
