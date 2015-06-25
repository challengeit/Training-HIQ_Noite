package inheritance;

public class App 
{
	public static void main(String[] args) 
	{
		Animal dog = new Dog();
		Animal cat = new Cat("Zé");
		Dog dog2 = new Dog();
		
		if(dog instanceof Dog)
			((Dog) dog).walk();
		cat.walk();
		dog.walk();
		
		
		System.out.println(dog.getName());
		System.out.println(dog2.getName());
	}
}
