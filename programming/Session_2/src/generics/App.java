package generics;

import java.util.ArrayList;
import java.util.List;

import domain.Director;
import domain.Driver;
import domain.Employee;
import domain.Person;

public class App 
{
	public static void main(String[] args) 
	{
		Cache cache = new Cache();
		cache.setItem(new Object());
		
		Object item = cache.getItem();
		if(item instanceof String)
			handle((String)item);
		
		if(item instanceof Integer)
			handle((Integer)item);
		
		GenericCache<Integer> genericCache;
		genericCache = new GenericCache<>();
		
		genericCache.setItem(10);
		handle(genericCache.getItem());
		
		//genericCache.display(1);
		
		
		GenericCache.<Employee, String>display(new Employee(0) {
			
			@Override
			public void xpto() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cooking() {
				// TODO Auto-generated method stub
				
			}
		}, "");
		
		//ArrayList<?> list = new ArrayList<>();
		//list.add((new Director(null, 0, 0)));
		
		List<Person> list = new ArrayList<>();
		list.add(new Director("Ze", 18, 1));
		displayListSize(list);
	}
	
	private static void displayListSize(List<? super Director> list)
	{
		System.out.println(list.size());
	}
	
	private static void handle(String str)
	{
		//System.out.println(str.charAt(0));
	}
	
	private static void handle(Integer i)
	{
		//System.out.println(i.compareTo(10));
	}
}
