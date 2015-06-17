package arrays;

public class ArraysDemoTests 
{
	public static void main(String[] args) 
	{
		// One dimensional arrays
		{
			int[] numbers;
			numbers = new int[5];
			numbers[2] = 3;
			numbers[4] = 5;
			display(numbers);
			
			int[] numbersWithInitialization = {1,2,3};
			display(numbersWithInitialization);
		}
		
		// Two dimensional arrays
		{
			int[][] numbers;
			numbers = new int[2][];
			numbers[0] = new int[3];
			numbers[0][2] = 4;
			numbers[1] = new int[1];
			display(numbers[0]);
			display(numbers[1]);
			
			int[][] numbersWithInitialization = {{1,4,5},{2}};
			display(numbersWithInitialization[0]);
			display(numbersWithInitialization[1]);
		}
		
		// Multidimensional arrays
		{
			int[][][] numbers = new int[2][][];
			numbers[0] = new int[2][];
			numbers[0][0] = new int[3];
			numbers[0][1] = new int[3];
			numbers[0][1][0] = 5;
			display(numbers[0][0]);
			display(numbers[0][1]);
		}
	}
	
	private static void display(int[] numbers)
	{
		for (int number : numbers) 
			System.out.print(number + " ");
		
		System.out.println();
	}
}
