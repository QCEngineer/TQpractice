package collection.com;

import java.util.Comparator;

class sortById implements Comparator<Shop>
{
	public int compare(Customers c1, Customers c2)
	{
		return c1.id-c2.id;
	}
}

class sortByAge implements Comparator<Shop>
{
	public int compare(Customers c1, Customers c2)
	
	{
		return c1.age-c2.age;
	}
}


class sortByName implements Comparator<Shop>
{
	public int compare(Customers c1, Customers c2)
	
	{
		return c1.customername.compareTo(c2.customername);
	}
}

public class SortingOption {

}