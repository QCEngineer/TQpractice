package arrayPractice;

public class A
{
	int accid;
	String name;
	float bal;
	Account()
	{
		bal = 1000; accid=0;name="";
	}
	Account(float b,String n,int a)
	{
		bal = b; accid=a;name=n;
	}
	public String toString() {
		return "accid=" + accid + "\n name=" + name + "\n bal=" + bal;
	}
	public void deposite(int x)
	{
		bal = bal+x;
	}
	public void withdraw(int x)
	{
		try
		{
		if(bal - x <1000)
			throw new InsuffFundsException("minimum balance rs.1000 needs to be maintained");
		else
		{
		bal = bal-x;
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
				
			}
		}
		
	}
	public void withdrawAmt(int x) throws InsuffFundsException
	{
		
		if(bal - x <1000)
				throw new InsuffFundsException("minimum balance"
						+ " rs.1000 needs to be maintained");
		else
		{
		bal = bal-x;
		System.out.println("Balanec updated to : " + bal);
		}
	
	}

}

