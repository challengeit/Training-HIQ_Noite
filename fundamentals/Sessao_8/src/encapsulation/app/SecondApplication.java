package encapsulation.app;

import encapsulation.Person;

public class SecondApplication
{
	public static void main(String[] args) 
	{
		Person person = new Person(-1, "Alice");
		System.out.println(person);
		
		person.setAge(-4);
	}
}