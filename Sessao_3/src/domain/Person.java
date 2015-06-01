package domain;

public class Person 
{
	private int _age;
	private String _name;
	
	public Person(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public void setAge(int age) { _age = age*10; }
	
	public int getAge() { return _age; }
	
	public void setName(String name) { _name = name; }
	
	public String getName() { return _name; }
	
	@Override
	public String toString() 
	{
		return new StringBuilder("[").append("age: ")
				.append(getAge()).append(", name: ")
				.append(getName()).append("]").toString();
	}
}
