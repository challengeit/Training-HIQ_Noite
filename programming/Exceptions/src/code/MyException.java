package code;

public class MyException extends Exception
{
	
	public MyException(Throwable e, String message)
	{
		super(message, e); 
	}
	
}

// java -enableassertions/-ea App
