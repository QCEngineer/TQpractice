import java.util.Scanner;

public class BinaryNumber_02 {

	static void decimalToBinary(int num)
	{

		System.out.println(Integer.toBinaryString(num));
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number : ");
		int num =sc.nextInt();
		decimalToBinary(num);
		sc.close();
	}
}

