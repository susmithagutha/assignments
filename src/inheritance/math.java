package inheritance;

public class math extends Department {
	public int budget=500;
public int getMinbudget()
{
	return budget;
}
public int getMaxbudget()
{
	return budget+getBudget();
}
	
}
