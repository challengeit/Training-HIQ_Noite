package synchronizers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Phaser;

public class App
{
	public static void main(String[] args) throws InterruptedException 
	{
//		final WC wc = new WC(2);
//		
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				try
//				{
//					wc.enter();
//					wc.exit();
//				} 
//				catch (InterruptedException e) {e.printStackTrace();}
//			}
//		};
//		
//		Thread t1 = new Thread(runnable, "Artur");
//		Thread t2 = new Thread(runnable, "Jacinta");
//		Thread t3 = new Thread(runnable, "Américo");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		t1.join();
//		t2.join();
//		t3.join();
		
//		final Park park = new Park(3);
//		
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Car entered.");
//				park.enterCar();
//			}
//		};
//		
//		Thread t1 = new Thread(runnable);
//		Thread t2 = new Thread(runnable);
//		Thread t3 = new Thread(runnable);
//		
//		Thread t4 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				try 
//				{
//					park.closeGate();
//					System.out.println("Gate closed.");
//				} 
//				catch (InterruptedException e) {e.printStackTrace();}
//			}
//		});
//		
//		t4.start();
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		
//		t4.join();
		
		final Phaser phaser = new Phaser(2);
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {	
				phaser.arrive();
				System.out.println("T1");
				phaser.register();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {	
				System.out.println("T2 before");
				phaser.arriveAndAwaitAdvance();
				System.out.println("T2");
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
