package exceptionPractice;



public class NullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object a = null;

		a.toString();    // this will throw a NullPointerException
	}
}