package maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class AMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> numbers = new HashMap<Integer,String>();
		//Map<Integer,String> numbers = new Hashtable<Integer,String>();
		numbers.put(1, "Um");
		numbers.put(2, "Dois");
		numbers.put(3, "Três");
		
		/**
		 * Example Case
		 * ------------
		 *
		numbers.put(4, null);
		numbers.put(null, "Quatro");
		numbers.put(null, null);
		//*/
	}
}
