package collection.com;


import java.util.ArrayList;
import java.util.ListIterator;;

public class Generic_ArrayList {

	public static void main(String[] args) 
	{

		ArrayList<Integer> list  = new ArrayList<>(23);
		System.out.println(list);

		//list.add("Abhay"); //compilation Error

		list.add(new Integer(56));
		list.add(23);
		list.add((int) 45.56f);
		list.add(23);

		System.out.println(list);

		for(int i=0 ;i<list.size();i++)
		{
			int data = list.get(i);
			list.set(i, data+5);
		}

		System.out.println("After adding 5 to each object ...");
		System.out.println(list);

		//using for each loop
		System.out.println("Using enhanced for loop...");
		for(Integer o : list)
		{
			System.out.println("Object is : " + o);
		}
	}
}
