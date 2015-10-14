package concurrent;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample
{
	private ReentrantReadWriteLock _lock = new ReentrantReadWriteLock(true);
	
	private StringBuilder builder = new StringBuilder();
	
	public void write(String str)
	{
		try
		{
			_lock.writeLock().lock();
			builder.append(str);			
		}
		finally 
		{
			_lock.writeLock().unlock();			
		}
	}
	
	public String read()
	{
		try
		{
			_lock.readLock().lock();
			return builder.toString();
		} 
		finally
		{
			_lock.readLock().unlock();
		}
	}
}
