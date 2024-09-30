package multithreading;

public class Alphabet extends Thread {
	
	@Override
	public void run() {
		for(char c='A'; c<='Z'; c++)
		{
			System.out.println("\tChar " + c);
		}
	}

}
