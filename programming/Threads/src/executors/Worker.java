package executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Worker 
{
	private ExecutorService _executor;
	
	public Worker()
	{
		_executor = Executors.newCachedThreadPool();
	}
	
	public void submitWork(Runnable runnable)
	{
		_executor.execute(runnable);
	}
	
	public <V> Future<V> submitWork(Callable<V> callable)
	{
		return _executor.submit(callable);
	}
	
	public void close() throws InterruptedException
	{
		_executor.awaitTermination(60, TimeUnit.SECONDS);
		_executor.shutdown();
	}
}
