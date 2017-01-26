package inheritance;

public class science extends Department{
	public int budget=1000;
	public int getMinbudget()
	{
		return budget;
	}
	public int getMaxbudget()
	{
		return budget+getBudget();
	}
}
