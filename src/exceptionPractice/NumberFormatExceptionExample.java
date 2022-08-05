package exceptionPractice;

/* The NumberFormatException is an unchecked exception in Java that occurs
 *  when an attempt is made to convert a string with an incorrect format to a 
 *  numeric value. Therefore, this exception is thrown when it is not possible
 *   to convert a string to a numeric type (e.g. int, float) */


public class NumberFormatExceptionExample {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt("java");
		System.out.println(a);
	}
}



