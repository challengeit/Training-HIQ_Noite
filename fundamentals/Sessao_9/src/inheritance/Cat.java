package inheritance;

public class Cat extends Animal 
{
	public Cat(String name) 
	{
		super(name);
	}

	@Override
	public boolean isMammal() 
	{
		return true;
	}

	@Override
	public void walk() 
	{
		System.out.println("Cat is walking...");
	}
}
