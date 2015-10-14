package main;

public class AppCounter
{
	public static void main(String[] args) throws InterruptedException 
	{
		final Counter counter = new Counter(0);
		
		Runnable runnnable = new Runnable() {
			@Override
			public void run() {	
				try{Thread.sleep(500);} catch(InterruptedException e){}
				counter.incr();
			}
		};
		
		int maxThreads = 1000;
		Thread[] threads = new Thread[maxThreads];
		// Create threads.
		for (int i = 0; i < maxThreads; i++)
			threads[i] = new Thread(runnnable);
		// Start threads.
		for (Thread thread : threads) 
			thread.start();
		
		// Join threads.
		for (Thread thread : threads) 
			thread.join();
		
		System.out.println(counter.getValue());
	}
	
	private static Object monitor1 = new Object();
	private static Object monitor2 = new Object();
	
	
	public static void deadLock1()
	{
		synchronized (monitor1) {
			synchronized (monitor2) {
				
				// 
			}
		}
	}
	
	public static void deadLock2()
	{
		synchronized (monitor2) {
			synchronized (monitor1) {
				
			}
		}
	}
	
}
