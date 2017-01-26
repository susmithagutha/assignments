package inheritance;

public class Language extends Department {
	public int budget=2000;
	public int getMinbudget()
	{
		return budget;
	}
	public int getMaxbudget()
	{
		return budget+getBudget();
	}
}
