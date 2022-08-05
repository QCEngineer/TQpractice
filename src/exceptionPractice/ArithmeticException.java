package exceptionPractice;

public class ArithmeticException  
{  
	void divide(int a, int b)  
	{  
		int div = a / b;  

		System.out.println("Division done successfully"); 

		System.out.println("Division is : " +div);  
	}  

	public static void main(String argvs[])  
	{  
		ArithmeticException obj = new ArithmeticException();  
		obj.divide(1, 0);  
	}  
}  