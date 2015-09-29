package strings;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class App {
	public static void main(String[] args) {
		
//		System.out.println("args length: " + args.length);
//		PrintWriter writer = new PrintWriter(System.out, true);
//		writer.println("args length: " + args.length);
//		writer.printf("args length: %1$d %2$d %1$d %s %s %s%n", args.length, args.length+1, "elements");
		
		
//		for (String arg : args) {
//			System.out.println(arg);
//		}

//		Long l1 = (long)120;
//		long l = Long.MAX_VALUE;
//		
//		System.out.println(l);
//		
//		String writerStr = String.format("%d", l);
//		System.out.println(writerStr);
//		
//		System.out.println(String.format("%4$2s %3$2s %2$2s%1$s", "a", "b", "c", "d"));
//		
//		Calendar c = new GregorianCalendar(1995, Calendar.JANUARY, 23);
//		
//		System.out.println(String.format("%1$TB %1$Te,%1$Ty", c));
		
		String str = "Blue Shirt, Red Shirt, Black Shirt, Maroon Shirt";
		String[] strSplit = str.split(", ");
		System.out.println(strSplit.length);
		for (String st : strSplit) {
			System.out.println(st);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
