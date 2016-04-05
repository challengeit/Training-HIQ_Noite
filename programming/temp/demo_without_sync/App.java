package demo_without_sync;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		final ShoppingCart shoppingCart = new ShoppingCart();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Mackbook Pro", 1500));
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Iphone 5S 16GB", 600));
			}
		});
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Ipad Air 128GB", 800));
			}
		});
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				shoppingCart.addItem(new Item("Apple Magic Mouse", 60));
			}
		});
		
		// start threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		// wait until threads ends
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		
		System.out.println(shoppingCart.getSummary()); // total should be 2.960
	}
}
