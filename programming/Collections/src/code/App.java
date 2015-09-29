package code;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class App 
{
	public static void main(String[] args) 
	{
		/**
		List array = new ArrayList();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add("quatro");
		
		int count = 0;
		
		for (Object integer : array) {
			count += (Integer) integer;
			System.out.println(integer);
		}
		*/
		
		Set<Integer> setExample = new TreeSet<Integer>();
		setExample.add(1);
		setExample.add(2);
		setExample.add(2);
		setExample.add(3);
		
//		System.out.println(setExample);
		
		Deque<Integer> deck = new ArrayDeque<Integer>();
		deck.push(1);
		deck.push(2);
		deck.push(3);
		deck.pop();
		
		System.out.println(deck);
		
		
	}
}
