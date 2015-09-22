package domain;

public class Director extends Employee implements Driver
{
	private int xpto = 30;
	
	public Director(String name, int age, int empId) 
	{
		super(name, age, empId);
	}
	
//	@Override
//	public int getXpto() 
//	{
//		return ((Person)this).xpto;
//	}
	
	public int getXpto2()
	{
		return ((Person)this).getXpto();
	}

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void xpto() {
	}
}
