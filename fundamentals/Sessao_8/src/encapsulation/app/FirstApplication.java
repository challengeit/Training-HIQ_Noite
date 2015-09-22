package encapsulation.app;

import encapsulation.Person;

public class FirstApplication 
{
	public static void main(String[] args)
	{
		Person person = new Person(20, "Bob");
		System.out.println(person.toString());
	}
}
