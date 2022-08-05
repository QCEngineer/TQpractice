
public class BinaryExample {



	public void convertBinary(int num){
		int b [] = new int[40];
		int index = 0;
		while(num > 0){
			b [index++] = num%2;
			num = num/2;
		}
		for(int i = index-1;i >= 0;i--)
		{
			System.out.println(b [i]);
		}
	}

	public static void main(String a[]){
		// TODO Auto-generated method stub


		BinaryExample obj = new BinaryExample();

		System.out.println("Binary representation of 50 : ");
		obj.convertBinary(5);


		obj.convertBinary(999);
	}
}





