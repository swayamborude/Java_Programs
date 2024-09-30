package multithreading.washingmachineexample;

public class Wash extends Thread {
	
	@Override
	public void run() {
		for(int w=1; w<=5; w++)
		{
			System.out.println("\tWash " + w);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
