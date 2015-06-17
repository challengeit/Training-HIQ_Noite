package model;

public class Team 
{
	private final int _id;
	private String _name;
	
	public Team(int id)
	{
		_id = id;
	}
	
	public Team(int id, String name)
	{
		this(id);
		_name = name;
	}
	
	public int getId() { return _id; }
	
	public String getName() { return _name; }
	
	public void setName(String name) { _name = name; }
	
	@Override
	public boolean equals(Object obj) 
	{
		return (obj instanceof Team)? ((Team)obj).getId() == getId() : false;
	}
}
