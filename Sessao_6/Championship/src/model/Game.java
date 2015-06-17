package model;

public class Game 
{
	private final Team _home;
	private final Team _visitor;
	
	private int _homeGoals;
	private int _visitorGoals;
	
	private boolean _isFinished;
	
	public Game(Team home, Team visitor)
	{
		_home 	 = home;
		_visitor = visitor;
	}
	
	public boolean isFinished() { return _isFinished; }
	
	public void finish() { _isFinished = true; }
	
	public void homeTeamScore() 
	{
		if(!_isFinished)
			_homeGoals++;
	}
	
	public void visitorTeamScore() 
	{
		if(!_isFinished)
			_visitorGoals++;
	}
	
	public Team getHomeTeam() { return _home; }
	
	public Team getVisitorTeam() { return _visitor; }
	
	public int getHomeTeamGoals() { return _homeGoals; }
	
	public int getVisitorTeamGoals() { return _visitorGoals; }
}
