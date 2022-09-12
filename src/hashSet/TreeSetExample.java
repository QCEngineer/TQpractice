package hashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Item> ts = new TreeSet<>();
		
		Item o1= new Item(111, "Basket Ball", 2000.00f);
		Item o2= new Item(100, "Tenis Ball", 900.00f);
		Item o3= new Item(111, "Basket Ball", 2000.00f);
		Item o4= new Item(118, "Hocky Stick", 7000.00f);
		Item o5= new Item(113, "Bat", 2500.00f);
		
		ts.add(o1);
		ts.add(o2);
		ts.add(o3);
		ts.add(o4);
		ts.add(o5);
		System.out.println("Tree Set is : " + ts);  //sorted tree Set
		System.out.println("Item entries in Tree Set"
				+ " using simple Iterator: - ");
		
		Iterator<Item> tset = ts.iterator();
		for(;tset.hasNext();)
		{
			System.out.println(tset.next());
		}
		System.out.println("\n_____________________");
		
		
System.out.println("Item entries in Tree Set "+
				"using simple descending Iterator: - ");
		
		tset = ts.descendingIterator();
		for(;tset.hasNext();)
		{
			System.out.println(tset.next());
		}
		
		
		
		System.out.println("________________________\n"+
						  "Item entries  in reverse Order"+
				          "using descendingSet() : - ");
		NavigableSet<Item> reverseset = ts.descendingSet();
		
		for(Item i : reverseset)
		{
			System.out.println(i);
		}
	
		
	//__________________________________________________
		
		TreeSet<Item> ts2 = new TreeSet<>(new ItemPriceComparator()	);
		ts2.add(o1);
		ts2.add(o3);
		ts2.add(o2);
		ts2.add(o4);
		ts2.add(o5);
		
		System.out.println("________________________\n"+
						"Comparator used for sorting : "+ts2.comparator());
		//System.out.println(ts2);
		 tset = ts2.iterator();
		for(;tset.hasNext();)
		{
			System.out.println(tset.next());
		}
		
		//Collections.syn
		
		
	}
	
}
