package encapsulation;

public class Person 
{
	private int age;
	private String name;
	
	public Person(int age, String name)
	{
		setAge(age);
		this.name = name;
	}
	
	public Person(int age, String name, String nif)
	{
		this(age, name);
		System.out.println(nif);
	}
	
	public void setAge(int age)
	{
		this.age = (age < 0)? 0 : age;
		
		this.age += Math.random();
		
		
	}
	
	public static void setAge(String age2)
	{
		
	}
	
	@Override
	public String toString() 
	{
		return new StringBuilder("[name: ").append(this.name).append(", age: ").append(this.age).append("]").toString();
	}
}
