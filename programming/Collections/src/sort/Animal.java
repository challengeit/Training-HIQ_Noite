package sort;

public class Animal implements Comparable<Animal>
{
	private String _name;
	private int _legs;
	
	public Animal(String name, int legs)
	{
		_name = name;
		_legs = legs;
	}

	public String getName() 
	{
		return _name;
	}

	public int getLegs() 
	{
		return _legs;
	}

	@Override
	public int compareTo(Animal animal) 
	{
		return _name.compareTo(animal.getName());
	}
	
	@Override
	public String toString() 
	{
		return String.format("Name: %s Leg Number: %d", getName(), getLegs()); 
	}
}
