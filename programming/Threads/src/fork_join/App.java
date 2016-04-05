package fork_join;

import java.util.concurrent.ForkJoinPool;

public class App
{
	public static void main(String[] args) 
	{
		int[] numbers = new int[350_000_000];
		for (int i = 0; i < numbers.length; i++) 
			numbers[i] = (int)(Math.random()*10);
		
//		{
//			long startTime = System.currentTimeMillis();
//			int sum = 0;
//			for (int number : numbers) 
//				sum += number;
//			
//			System.out.println(sum + ", in " + (System.currentTimeMillis() - startTime) + " ms");
//		}
		
		{
			ForkJoinPool pool = new ForkJoinPool();
			long startTime = System.currentTimeMillis();
			int sum = pool.invoke(new Task(numbers, 0, numbers.length - 1, 100000));
			System.out.println(sum + ", in " + (System.currentTimeMillis() - startTime) + " ms [fork join]");
		}
	}
}
