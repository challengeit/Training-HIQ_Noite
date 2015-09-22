package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App 
{
	private static void m1() throws FileNotFoundException
	{
		m2();
	}
	
	private static void m2() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("text.txt");
		int[] array = new int[2];
		array[2] = 2;
	}
	
	public static void main(String[] args)
	{		
		ArrayList list = new ArrayList();
		while(true) {
			String str = "A test String";
			list.add(str);
			if(list.size() % 1000000 == 0) {
				System.out.println("List now has " + list.size() / 100000 + " million elements!");
			}
		}
//		try {
//			m1();
//		} 
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Index out of array bounds...");
//		}
//		catch (FileNotFoundException e) {
//			System.out.println("File not found...");
//		}
		
	}
}
