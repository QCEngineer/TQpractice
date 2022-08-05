package collection.com;

public class Shop {

	int id;

	String customername;
	String product;
	int age;

	public Shop () {}

	public Shop(int i,String s1,String s2,int p) 
	{
		id=i;
		customername =s1;
		product=s2;
		age =p;
	}
	public String toString()
	{
		return "[" +id+ " , " +customername+ " ," +product+ "," +age+ "]";	
	}

	public int compareTo(Shop p)
	{
		if (this.age<p.age)
			return 1;

		else if (this.age>p.age)
			return -1;

		else 
			if (this.customername.compareTo(p.customername)<0)
				return 1;
			else 
				if (this.customername.compareTo(p.customername)>0)
					return -1;
				else 
					return 0;

	}
}


