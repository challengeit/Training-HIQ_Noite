package arrays;

public class ArraysDemo 
{
	public static void main(String[] args)
	{	
		// One dimensional array
		{
			Integer[] numbers = new Integer[3];
			numbers[1] = 4;
			display(numbers);
			
			int[] numbers2 = {1,2,3,4,5};
			display(numbers2);
		}
		// Two dimensional array
		{
			Integer[][] numbers = new Integer[2][];
			numbers[0] = new Integer[2];
			numbers[1] = new Integer[5];
			display(numbers[0]);
			display(numbers[1]);
			
			int[][] numbers2 = {{1,2,3}, {1,4,5}};
			display(numbers2[0]);
			display(numbers2[1]);
		}
		
		// Multidimensional array
		{
			int[][][][] numbers = new int[2][][][];
			numbers[0] = new int[2][][];
			numbers[0][0] = new int[2][];
			numbers[0][0][0] = new int[2];
			numbers[0][0][0][0] = 1;
			display(numbers[0][0][0]);
			
			int[][][][] numbers2 = {{{{1,2}, {}}, {{}, {}}},{{{}, {}}, {{}, {}}}};
			display(numbers2[0][0][0]);
		}
		
		{
			Object[] objs = new Object[3];
			objs[0] = "String";
			objs[1] = new Integer(20);
			objs[2] = 10;
			display(objs);
			
			Object str = objs[0];
			System.out.println(((String)str).indexOf("S"));
		}
		
	}
	
	private static void display(Object[] objs)
	{
		for (Object obj : objs) 
			System.out.print(obj + " ");
		
		System.out.println();
	}
	
	private static void display(int[] numbers)
	{
		for (int number : numbers) 
			System.out.print(number + " ");
		
		System.out.println();
	}
}
