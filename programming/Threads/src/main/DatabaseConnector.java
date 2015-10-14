package main;

public class DatabaseConnector 
{
	private static volatile DatabaseConnector singletonInstance;
	
	public static DatabaseConnector getInstance(String url)
	{
		if(singletonInstance == null)
		{
			synchronized (DatabaseConnector.class)
			{
				if(singletonInstance == null)
					singletonInstance = new DatabaseConnector(url);
					System.out.println();
			}
		}
		
		return singletonInstance;
	}
	
	private DatabaseConnector(String url)
	{}
}
