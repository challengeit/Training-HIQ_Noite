package App;

public class App
{
	public static void main(String[] args)
	{
		//		  Integer i = 10;
		//        Integer j = 11;
		//        Integer k = i++;         // INCR
		//        System.out.println("k == j is " + (k == j));
		//        System.out.println("k.equals(j) is " + k.equals(j));

		//        Integer i = 10;
		//        Integer k = ++i + ++i;
		//        System.out.println(k);
		//        System.out.println(i);

		//		Integer i = 10;
		//        Integer k = ++i + i++;
		//        System.out.println(k);
		//        System.out.println(i);

		//		Integer i = 10;
		//		Integer k = 0;
		//        k = ++i + i++ + k++;
		//        System.out.println(k);
		//        System.out.println(i);

		//      Integer i = 10;
		//      i = ++i + ++i;
		//      System.out.println(i);

		//		Integer i = 10;
		//		i = ++i + i++;
		//		System.out.println(i);

		//		Integer i = 10;
		//		i = i++;
		//		System.out.println(i);


		Integer i = 10;
		Integer k = 0;
		k = ++i + i++ + ++k;
		System.out.println(k);
		System.out.println(i);
	}
}
