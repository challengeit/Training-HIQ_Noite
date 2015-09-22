package main;

public class App {

	
	public static void xpto(double x)
	{
		if(x > 2)
			return;
	}
	
	
	public static void main(String[] args) {
		
		double a5 = 10;
		
		char c = 1;
		xpto(c);
		
		// 'a' - 97
		// '1' - 49
		
//		char a = 'a';
//		char b = -10;
//		char c = '1';
//		Integer d = 1000;
//		System.out.println(++a + b++ * c - d + b);
		
		// a-> 98, b -> 10, c -> 49, d -> 1000
		// a-> 98, b * c -> 490, d -> 1000
		// 588 - 1000
		// - 401
		
		
		// b-> 10
		// 10 * '1'
		// 'b' + 10 * '1'
		// 'b' + 10 * '1' - 1000
	}
}
