package app;

import domain.Person;

public class App 
{	
	public static void main(String[] args) 
	{

		int number = 10;
		Person person = new Person("Ze", 20);
		Person person2 = person;
		
		System.out.println(person);
		
		
		StringBuilder s = new StringBuilder("Maria");
		xpto(number, person, s);
		
		/*
		System.out.println("Hello World");
		for (String arg : args)
		{
			if(arg.equals(args[args.length - 1]))
				System.out.print(arg);
			else
				System.out.print(arg + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i < args.length; i++) 
			System.out.print(args[i] + ((i == args.length - 1)? "" : ", "));
		
		System.out.println();
		
		String parameters = "";
		for (int i = 0; i < args.length - 1; i++)
			parameters += args[i] + ", ";
		
		if(args.length > 0)
			parameters += args[( args.length > 0? args.length : 1 ) - 1];
		
		System.out.println(parameters);
		*/	
	}
	
	public static void xpto(int number, Person person, StringBuilder s)
	{
		person.setAge(25);
	}
	
	
	
	
	
	
	
	
	
	
	
}