package concurrent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class App 
{
	public static void main(String[] args) throws InterruptedException
	{
		List<String> list = Collections.synchronizedList(new ArrayList<>());
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		
		
		final ReadWriteLockExample rwl = new ReadWriteLockExample();
		
		Runnable writeRunnable = new Runnable() {
			@Override
			public void run() {
				rwl.write("LALA ");
			}
		};
				
		Runnable readRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(rwl.read());
			}
		};
		
		Thread writer1 = new Thread(writeRunnable);
		Thread writer2 = new Thread(writeRunnable);
		Thread read1 = new Thread(readRunnable);
		Thread read2 = new Thread(readRunnable);
		
		read1.start();
		read2.start();
		writer1.start();
		writer2.start();
		
		read1.join();
		read2.join();
		writer1.join();
		writer2.join();
	}
}
