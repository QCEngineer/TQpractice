package exceptionPractice;

public class Store
{
	int noItemAvailable;
	int maximumLevel;
	int minimumLevel;

	public Store(int a,int b,int c)
	{
		noItemAvailable =a;
		maximumLevel=b;
		minimumLevel=c;
	}
	public void addItem (int a )throws IteamStockUnderFlowException {

	public void noOfIteamsAvailabal ()
	{
	return ;	
	}
	public void MaximumLevel(int a)
	{
		try
		{
		if(price - a <1000)
			
			throw new InsuffFundsException(" minimum price rs.1000 needs to be maintained");
		else
		{
			price = price-a;
			
		System.out.println("Balanec updated to : " + bal);
		}
		}
		catch(InsuffFundsException e)
		{
			Throwable t = new Throwable("Minmum funds Rs 1000 is required as Bank Rule");
			e.initCause(t);
			try {
				throw e;
			} 
			catch (InsuffFundsException e1) {
				System.out.println(e1.getCause());
				System.out.println(e1.getMessage());
				System.out.println(e1.getClass());
				
			}}
