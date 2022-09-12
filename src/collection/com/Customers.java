package collection.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.Comparator;

public class Customers implements  Comparable<Customers>
 {

	ArrayList<Shop>l;

	public Customers ()
	{
		l=new ArrayList<Shop>();
		System.out.println(l);

	}
	public void customersDetails ()
	{
		Shop obj = new Shop(1000,"Arvind","phone",25);

		l.add(obj);
		l.add(new Shop (100,"Ram","Laptop",30));
		l.add(new Shop (1500,"Shyam","AC",35));
		l.add(new Shop (1300,"Vishal","TV",40));
		
		
		Collections.sort(l);


		System.out.println(l);
	}
	public void showDetails ()
	{
		/*for (int i=0;i<l.size();i++)
		{
			Shop obj=l.get(i);

			if (obj.age>=30)
				System.out.println(obj);

		}*/

		Iterator <Shop> itr =l.iterator();
		while (itr.hasNext())
		{
			Shop ab=itr.next();
			System.out.println(ab);

		}
	}
	public void showMinPrice()
	{
	/*	Iterator <Shop> itr2 =l.iterator();
		Shop pq =l.get(0);
		int min =pq.price;

		System.out.println(min);

		while (itr2.hasNext())
		{
			Shop o=itr2.next();
			if (min>o.price)
			{
				pq=o;

			}*/
			for (Shop s :l)
			{
				if (s.age>=35)
					System.out.println(s);
			}
		}

		// System.out.println(pq);	
	//}
	public void consumer()
	{
		System.out.println("Using ForEach Method");
		
		Consumer <Shop> cm =(str)-> System.out.println(str);
		
		l.forEach(cm);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customers ab =new Customers();
		ab.customersDetails();
		ab.customersDetails();
		ab.showMinPrice();
		ab.consumer();

	}

}
