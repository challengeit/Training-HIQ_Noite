package model;

public class Championship 
{
	private final int _id;
	private Team[] _teams;
	private int _teamsIndex;
	private Game[] _games;
	private int _gamesIndex;
	
	public Championship(int id, int numberTotalTeams, int numberTotalGames)
	{
		_id = id;
		_teams = new Team[numberTotalTeams];
		_games = new Game[numberTotalGames];
	}
	
	public int getId() { return _id; }
	
	public Team addTeam(int id, String name)
	{
		if(_teamsIndex == _teams.length)
			return null;
		
		Team team = new Team(id, name);	
		_teams[_teamsIndex++] = team;
		return team;
	}
	
	public Game scheduleGame(Team home, Team visitor)
	{
		if(_gamesIndex == _games.length)
			return null;
		
		Game game = new Game(home, visitor);
		_games[_gamesIndex++] = game;
		return game;
	}
	
	public int getUnfinishedGames()
	{
		int counter = 0;
		
		for (Game game : _games) 
		{
			if(game != null && game.isFinished())
				counter++;
		}
		
		return counter;
	}
	
	public Team[] getTopScoreTeams()
	{
		Team[] teams = null;
		for(int i = 0, index = 0, currentGoals = 0; i < _teams.length; i++) 
		{
			Team team = _teams[i];
			if(team == null)
				break;
			
			int goals = countTeamGoals(team);
			if(teams == null || goals > currentGoals)
			{
				teams = new Team[_teams.length];
				index = 0;
			}
			
			if(goals >= currentGoals)
			{
				teams[index++] = team;
				currentGoals = goals;
			}
		}
		
		return teams;
	}
	
	private int countTeamGoals(Team team)
	{
		int counter = 0;
		
		for (Game game : _games)
		{
			if(game == null)
				break;
			
			if(game.getHomeTeam().equals(team))
				counter += game.getHomeTeamGoals();
		
			else if(game.getVisitorTeam().equals(team))
				counter += game.getVisitorTeamGoals();
		}
		
		return counter;
	}
}
