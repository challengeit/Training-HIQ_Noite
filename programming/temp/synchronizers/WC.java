package synchronizers;

import java.util.concurrent.Semaphore;

public class WC 
{
	private Semaphore _semaphore;
	
	public WC(int numberOfToilets)
	{
		_semaphore = new Semaphore(numberOfToilets, true);
	}
	
	public void enter() throws InterruptedException 
	{
		_semaphore.acquire();
		System.out.println("Estou em esforço... " + Thread.currentThread().getName());
		Thread.sleep(5000);
	}
	
	public void exit()
	{
		_semaphore.release();
	}
}
