package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while (true) 
		{
			System.out.println("Enter your regex: ");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            Matcher matcher = pattern.matcher("diogo.matos@challenge.pt");
            StringBuilder sb = new StringBuilder();

            while (matcher.find()) 
            	sb.append(matcher.group()).append("");
            
            if(sb.length() == 0) 
            	System.out.println("No match found.");
            else
            	System.out.println(sb.toString());
            sb.setLength(0);
            System.out.println();
        }
	}
}
