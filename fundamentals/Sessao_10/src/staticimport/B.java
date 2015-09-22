package staticimport;

import static staticimport.A.*;
import static staticimport.C.*;

public class B 
{
	static double d;
	static String s;
	public static void tempo()
	{
		System.out.println("B.temp");
		System.out.println(MyPI);
	}
	
	public static void main(String[] args) {
		//temp();
		String str = "1";
		int i = 1;
		System.out.println(str.equals(1));
		

		System.out.println(s + d);
		
	}
}
