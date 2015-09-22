package domain;

public abstract class Person implements Chef
{
	public class Member
	{
		private final String name;
		public Member(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public String getPersonName()
		{
			return Person.this.name;
		}
		
		public Person getPerson()
		{
			return Person.this;
		}
	}
	
	public static final boolean IS_HUMAN = true;
	private String name;
	private int age;
	
	protected int xpto = 10;
	
	public Person(String name, int age) 
	{
		setName(name);
		setAge(age);
	}
	
	public int getXpto()
	{
		return xpto;
	}
	
	public void setAge(int age)
	{	
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	protected void setName(String name)
	{
		this.name = name;
	}
	
	public final String getName()
	{
		return name;
	}
	
	public void concatName(StringBuilder builder)
	{
		builder.append(getTagName()).append(" :").append(getName());
	}
	
	// Hook method
	protected abstract String getTagName(); 
	
	@Override
	public String toString() 
	{
		return new StringBuilder(this.getName()).append(",").append(this.getAge()).toString();
	}
}
