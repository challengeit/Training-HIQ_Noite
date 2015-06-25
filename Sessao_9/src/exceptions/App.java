package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App 
{
	private static void m1()
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] array = new int[2];
		array[2] = 1;
		
		try 
		{
			FileInputStream fis = new FileInputStream("text.txt");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			
		}
		
		
		m1();
	}
}
