package domain;

public abstract class Employee extends Person implements Driver
{
	private final int empId;
	public static final boolean IS_HUMAN = false;
	
	private int xpto = 20;
	
	public Employee(String name, int age, int empId) 
	{
		super(name, age);
		this.empId = empId;
		
		super.setName("ze");
	}
	
	public Employee(int empId)
	{
		this("Ze", 20, empId);
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public int getXpto()
	{
		return xpto;
	}
	
	@Override
	public String getTagName() {
		return "Employee";
	}
	
	@Override
	public String toString() 
	{
		return new StringBuilder(super.toString()).append(",").append(empId).toString();
		// return super.toString() + "," + empId;
	}
}
