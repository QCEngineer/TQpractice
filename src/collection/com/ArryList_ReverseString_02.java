package collection.com;
import java.util.*;

class RevArrayList_02 {
	
	// Java program for reversing an arraylist

	public ArrayList<String> reverseArrayList(ArrayList<String> alist)
	{
		ArrayList<String> revArrayList = new ArrayList<String>();
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
		reverseArrayList(alist);
		
		return alist;                                            // incomplete
	}
	public void printString(ArrayList<String> alist)
	{	
		for(int i=alist.size()-1;i>=0;i--)
		{
			System.out.println(alist.get(i));
		
		System.out.println(alist.get(i));
		}
	}
}

public class ArryList_ReverseString_02 {
	
	public static void main(String[] args)
	{
		RevArrayList ab = new RevArrayList();

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("hiii");
		ar.add("Good");
		ar.add("Morning");
		ar.add("Guys");
		
		System.out.println("Elements before reversing:"+ar);
		
		
		System.out.println("Elements after reversing:"+ar);
	}
}
