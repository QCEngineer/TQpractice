package try_catchPractice;

public class Basic_finally_Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("try block");

			throw new NullPointerException("null occurred");
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("catch block 1");
		}
		catch (NullPointerException e) 
		{
			System.out.println("catch block 2");
		}
		catch (Exception e) 
		{
			System.out.println("catch block 3");
		} 
		finally
		{
			System.out.println("finally block");
		}

	}

}
