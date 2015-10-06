
public class App 
{
	public static void main(String[] args) {
		State s1 = State.OFF;
		m1(s1);
	}
	
	
	public static void m1(State temp)
	{
		System.out.println("O meu computador está: " + temp.getDescription());
	}
}

enum State {
	ON("on"),
	OFF("off"), 
	SUSPENDED("suspended");
	
	private String description;
	
	State(String d)
	{
		description = d;
	}
	
	public String getDescription()
	{
		return description;
	}
}