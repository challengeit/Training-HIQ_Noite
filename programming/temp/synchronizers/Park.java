package synchronizers;

import java.util.concurrent.CountDownLatch;

public class Park {
	
	private CountDownLatch _cdl;
	
	public Park(int count)
	{
		_cdl = new CountDownLatch(count);
	}
	
	public void enterCar()
	{
		_cdl.countDown();
	}
	
	public void closeGate() throws InterruptedException
	{
		_cdl.await();
	}
}
