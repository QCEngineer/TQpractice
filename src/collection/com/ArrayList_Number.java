package collection.com;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList_Number {

	/**
	 * @param args
	 */
	public void addElement(ArrayList<Integer> s)
	{
		for(int i=0; i<=20; i++)
		{
			if(i%2==0)
			{
				s.add(i);
			}
		}
	}
	public void showElement(ArrayList<Integer> s)
	{
		for(int i=0;i<s.size();i++)
		{
			System.out.print("-"+s.get(i));
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		int sc=new.Int();
		ArrayList<Integer> s = new ArrayList();
		
		ArrayList_Add_EvenNumber obj = new ArrayList_Add_EvenNumber();
		obj.addElement(s);
		obj.showElement(s);

	}

}