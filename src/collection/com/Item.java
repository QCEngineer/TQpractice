package collection.com;

class Item {

	String customername;
	int id;
	float cost;

	public Item () {}

	public Item(String cn,int i,float p) 
	{
		customername=cn;
		id =i;
		cost=p;
	}
	
	public String toString()
	{
		return "[" +customername+ " , " +id+ " ," +cost+ "]";	
	}

	public int compareTo(Shop p)
	{
		if (this.id<p.age)
			return 1;

		else if (this.id>p.age)
			return -1;

		else 
					return 0;

	}
}
