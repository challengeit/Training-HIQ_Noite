package main;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter 
{
	private AtomicInteger _count;
	
	public Counter(int initValue)
	{
		_count = new AtomicInteger(initValue);
	}
	
	public void incr()
	{
		_count.getAndIncrement();
	}
	
	public void decr()
	{
		_count.getAndDecrement();
	}
	
	public int getValue()
	{
		return _count.get();
	}
}