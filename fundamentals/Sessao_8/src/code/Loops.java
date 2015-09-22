package code;

/**
 * Session to practice Loops in Java.
 * @author Challenge.IT
 */
public class Loops 
{
	public static void main(String[] args) 
	{
		int[] array = new int[0];
		
		{	
			int index = 0;
			while(index < array.length)
			{
				array[index++] = 10;
			}
		}
		
		{
			int index = 0;
			do {
				if(array.length == 0) 
					break;
				array[index] = 10;
			} while(++index < array.length);
		}
		
		{	
			for(int i = 0; i < array.length; i++)
			{
				array[i] = 10;
			}
		}
		
		{
			int index = 0;
			for(int elem : array)
			{
				array[index++] = 10;
			}
		}
		
		{
			int[] inteiros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			for(int elem : inteiros)
			{
				if(elem%2 != 0) {
					//System.out.println(elem);
					continue;
				}
				//System.out.println("fazer algo util");
			}
			
		}
		
		{
			String temp = "batatas";
			switch(temp)
			{
				case "batatas":
					System.out.println(temp);
				case "cenouras":
					System.out.println("cenouras");
					break;
				default:
					System.out.println("default");
			}
		}
		
		
		/*
		if(array.length == 1)
			if(index == 3)
				System.out.println("sad");
			else 
				System.out.println("dsa");
		//else
		//	System.out.println("fdsf");
		 */
	}
}
