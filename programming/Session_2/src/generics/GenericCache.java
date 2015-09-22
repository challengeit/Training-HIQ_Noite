package generics;

import domain.Chef;
import domain.Driver;
import domain.Employee;

public class GenericCache<T>
{
	private T _item;
		
	public GenericCache(T item)
	{
		setItem(item);
	}
	
	public GenericCache() {}

	public void setItem(T item) 
	{
		_item = item;
	}

	public T getItem() 
	{
		return _item;
	}
	
	static public <E extends Employee & Driver, E2> E display(E elem, E2 elem2)
	{
		return elem;
	}
}
