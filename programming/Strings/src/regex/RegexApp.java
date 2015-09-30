package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 00:00
 * 23:59
 * 
 * ([0-1]\d|2[0-3]):[0-5][0-9]
 */


public class RegexApp 
{	
	public static void main(String[] args) 
	{
		Pattern pattern = Pattern.compile("([0-1]\\d|2[0-3]):[0-5][0-9]");
		Matcher matcher = pattern.matcher("3:59");
		System.out.println(matcher.matches());
		/*
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
        */
	}
}
