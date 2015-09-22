package generics;

public class Cache 
{	
	private Object _item;
	
	public Cache(Object item)
	{
		setItem(item);
	}
	
	public Cache() {}

	public void setItem(Object item) 
	{
		_item = item;
	}

	public Object getItem() 
	{
		return _item;
	}
}
