package inheritance;

public class Dog extends Animal
{

	public Dog(String name) 
	{
		super(name, 4, true);
		System.out.println("ctor");
	}
	
	public Dog()
	{
		this("Bobby");
	}
	
	{
		System.out.println("Entrei");
	}
	
	@Override
	public String getName() {
		return "Dog: " + super.getName();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Dog)
		{
			return super.equals(obj);	
		}
		return false;
	}

	@Override
	public void walk() {
		System.out.println("Dog is walking...");
	}

	@Override
	public boolean isMammal() {
		return false;
	}
	
	public void jump()
	{
		System.out.println("Dog is jumping...");
	}
	
}
