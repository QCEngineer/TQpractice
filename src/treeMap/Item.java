package treeMap;

import java.util.Comparator;

public class Item implements Comparable<Item> {
	
	int id,iCost;
	String iName;
	
	
	Item(){}
	Item(int id,String itemName,int iCost) // incomple
	{
		this.id = id;
		this.iName = itemName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}
	
	class SortbyCost implements Comparator<Item> {

		public int compare(Item ic1, Item ic2)
		{
			return ic1.iCost - ic2.iCost;
		}
	}
}