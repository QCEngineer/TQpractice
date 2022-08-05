package collection.com;
import java.util.*;

public class ArrayList_RevString {

	public void addElements(ArrayList<String> str)
	{
		str.add("Good");
		str.add("Gorning");
		showElements(str);
	}

	public void showElements(ArrayList<String> str)
	{
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
		System.out.println();
		addElements(str);                     // incomplete
	}

	public void revEle(ArrayList<String> str)
	{
		System.out.println("Reverse List : " );
		for(int i=str.size()-1;i>=0;i--)
		{
			System.out.println(str.get(i));
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();

		ArrayList_RevString obj = new ArrayList_RevString();

		obj.addElements(str);


	}
}