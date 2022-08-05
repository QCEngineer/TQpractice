package collection.com;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList_StringChar_Remove {

	public void checkLEength (ArrayList<String> o)
	{
		Iterator <String> itr=o.iterator();
		while (itr.hasNext())
		{
			String str =itr.next();
			int size=str.length(); 
			if (size>5)
			{
				itr.remove();
			}
		}
		System.out.println(o);


	}
	public static void main (String [] args) {

		ArrayList_StringChar_Remove obj=new ArrayList_StringChar_Remove();

		ArrayList<String> ob = new ArrayList<> ();

		System.out.println(ob);

		System.out.println(ob.size());

		ob.add("heyy");
		ob.add("Good");
		ob.add("Morning");

		System.out.println(ob);

		obj.checkLEength(ob);

	}
}