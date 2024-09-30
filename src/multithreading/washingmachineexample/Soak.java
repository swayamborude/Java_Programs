package multithreading.washingmachineexample;

public class Soak extends Thread {
	
	@Override
	public void run() {
		for(int s=1; s<=5; s++)
		{
			System.out.println("Soak " + s);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
