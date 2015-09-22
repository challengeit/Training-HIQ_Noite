package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		System.out.println(list.get(1).equals(new Integer(3)));

		
		list.remove(new Integer(3));
		System.out.println(list);
		
		System.out.println(list.contains(new Integer(1)));
	}
}
