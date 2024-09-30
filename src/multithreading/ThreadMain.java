package multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		
		Number thread1 = new Number();
		//thread1.start();
		thread1.start();
		
		Alphabet thread2 = new Alphabet();
		thread2.start();
	
	    for(int i=1; i<=5; i++)
	    {
	    	System.out.println("\t\tMain " + i);
	    }
	    
	    // This program running parallaly because,
	    // multiple threads to run in parallel

	}
}
