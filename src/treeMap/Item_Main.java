package treeMap;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class Item_Main {

	public static void main(String[] args) {
		
		TreeMap< Item, Integer> tmap = new TreeMap<Item, Integer>(new SortbyCost ());

		tmap.put(new  Item(10, "phone", 10000);
		tmap.put(new  Item(20, "laptop", 11000);
		tmap.put(new  Item(30, "AC", 12000);  // incomplete
		tmap.put(new  Item(40, "TV", 12000);


		System.out.println("TreeMap of Students : " + tmap);
				
	}
	}