package code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App 
{
	public void xpto() throws Exception 
	{
		System.out.println("method");
		throw new Error();
	}
	
	public static int test()
	{
		int i = 0;
		App app = new App();
		try
		{
			app.xpto();
		}
		catch(Exception | Error e)
		{
			System.out.println("a");
			i = 1;
		}
		
		return i;
	}
	
	public static void main(String[] args) 
	{
		try(FileInputStream input = new FileInputStream("test.txt");
				FileInputStream input2 = new FileInputStream("asd"))
		{
			
		} 
		catch (IOException e) 
		{
			Throwable[] exs = e.getSuppressed();
			
			
		}
	}
}
