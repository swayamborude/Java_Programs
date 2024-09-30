package multithreading.washingmachineexample;

public class Dry extends Thread {

	@Override
	public void run() {
		for(int d=1; d<=5; d++)
		{
			System.out.println("\t\tDry " + d);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
