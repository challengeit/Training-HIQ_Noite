package executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class App 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		Worker worker = new Worker();
		
		worker.submitWork(new Runnable() {
			@Override
			public void run()
			{
				System.out.println(Thread.currentThread().getName());
			}
		});
		
		Future<String> future = worker.<String>submitWork(new Callable<String>() {
			@Override
			public String call() throws Exception
			{
				return Thread.currentThread().getName() + " from callable";
			}
		});
		
		String res = future.get();
		System.out.println(res);
		
		System.out.println(Thread.currentThread().getName());
		
		worker.close();
	}
}
