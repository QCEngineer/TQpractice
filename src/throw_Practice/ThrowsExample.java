package throw_Practice;
import java.util.InputMismatchException;
import java.util.Scanner;

class CheckedException
{
	int num;
	Scanner sc = new Scanner (System.in);
	public void acceptNum() throws InputMismatchException
	{
		System.out.println("Enter Number : ");
		num  = sc.nextInt();

		if(num == num ) 


			System.out.println("Thank YOu ");

		else 

			throw new InputMismatchException("Its Only Number " + "\nNot Character");

		System.out.println("You have entered :"+num);
	}
}

public class ThrowsExample {

	public static void main(String []args) {

		CheckedException obj = new CheckedException();
		try
		{
			obj.acceptNum();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
		}

	}
}
