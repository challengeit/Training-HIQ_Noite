package main;

public class App {
	public static void main(String[] args) throws InterruptedException {
//		MyThread thread = new MyThread();
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println(Thread.currentThread().getName());
//			}
//		});
//		thread.start();
//		thread.join();
//		System.out.println(Thread.currentThread().getName());
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(sumWithSingleThread(numbers));
		System.out.println(sumWithTwoThreads(numbers));
	}
	
	private static int sumWithSingleThread(int[] numbers)
	{
		int res = 0;
		for (int i : numbers)
			res += i;
		
		return res;
	}
	
	public static int sumWithTwoThreads(int[] numbers) throws InterruptedException 
	{
		class WrapperRes { int res1 = 0; int res2 = 0; }
		
		final WrapperRes wrapperRes = new WrapperRes();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < numbers.length; i+=2) {
					wrapperRes.res1+= numbers[i];
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < numbers.length; i+=2) {
					wrapperRes.res2+= numbers[i];
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		return wrapperRes.res1 + wrapperRes.res2;
	}
}
