package fork_join;

import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
public class Task extends RecursiveTask<Integer> 
{
	private final int[] _numbers;
	private final int _start;
	private final int _end;
	private final int _threshold;
	
	
	public Task(int[] numbers, int start, int end, int threshold)
	{
		_numbers = numbers;
		_start = start;
		_end = end;
		_threshold = threshold;
	}
	
	@Override
	protected Integer compute()
	{
		if((_end - _start) < _threshold)
		{
			int partialSum = 0;
			for (int i = _start; i <= _end; i++) 
				partialSum += _numbers[i];
			
			return partialSum;
		}
		
		int mid = (_end - _start)/2 + _start;
		
		Task tLeft = new Task(_numbers, _start, mid, _threshold);
		tLeft.fork();
		
		Task tRight = new Task(_numbers, mid+1, _end, _threshold);
		
		return tRight.compute() + tLeft.join();
	}
	
}
