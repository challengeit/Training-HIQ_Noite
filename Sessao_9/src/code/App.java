package code;

import static java.lang.Math.PI;

public class App implements IInt
{
	public static void main(String[] args) 
	{
		App app = new App();
		int a = app.theValue;
		int k = IInt.theValue;
		int l = theValue;
		double d = PI;
		
		
		Integer i = new Integer(42);
		Long ln = new Long(42);
	}
}

interface IInt
{
	int theValue = 0;
}
