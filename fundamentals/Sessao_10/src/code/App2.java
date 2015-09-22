package code;

import java.io.IOException;
import java.util.Set;

public class App2 
{
	public Set getSet(int a) throws Exception
	{
		return null;
	}
}

abstract class Son extends App2
{
	@Override
	public abstract Set getSet(int a) throws Exception;
}

class Grandson extends Son
{

	@Override
	public Set getSet(int a) throws IOException
	{
		return null;
	}
	
}