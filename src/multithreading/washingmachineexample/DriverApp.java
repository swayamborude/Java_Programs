package multithreading.washingmachineexample;

public class DriverApp {

	public static void main(String[] args) throws InterruptedException {

		Soak s1 = new Soak();
		Wash w1 = new Wash();
		Dry d1 = new Dry();
		
		s1.start();
		s1.join();  // join will put the current thread on wait until the thread on which is dead.
		w1.start();
		w1.join();
		d1.start();
		
		//so this program execute in serially because of join method 

	}

}
