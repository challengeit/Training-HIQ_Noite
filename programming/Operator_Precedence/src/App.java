
public class App 
{
	public static void main(String[] args) 
	{
					// -18				-4
		double res = (double)(25%2*2 - 5 * 4) / (2 - 10 + 4);
		System.out.println(res);
		
		int i = 15, j = 10;
		System.out.println("Res = " + (i++ + 1 + j++ + --j));//36
		System.out.println("i = " + i + " j = " + j);//16, 10
		
		i = 15; j = 10;
		int a = (i++) + i;
		// i 16
		// a 31
		int b = i + (i++);
		// i 17
		// b 32
		System.out.println("a = " + a + " b = " + b);
		
		i = 15;
		res = (double)(25%2*2 - i-- - --i * 5 * 4) / (2 - 10 + 4);
		System.out.println("res: " + res + ", i: " + i);
		
	}
}
