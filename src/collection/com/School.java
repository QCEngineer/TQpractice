package collection.com;

import java.util.ArrayList;
import java.util.Comparator;

public class School implements  Comparable<School> ,Comparator <School>  
{

	int id,age;
	String sname;


	public School () {}

	public School(int i,int a ,String s) 
	{
		id=i;
		sname =s;
		age =a;
	}
	public String toString()
	{
		return "[" +sname+ " , " +id+ " , " +age+ "]";	
	}

	public int compareTo(School pq)
	{
		if (this.age<pq.age)
			return 1;

		else if (this.age>pq.age)
			return -1;

		else 
			
					return 0;

	}
	
	ArrayList<School>l;

	public void customersDetails ()
	{
		School obj = new School("Arvind",1000,25);

		l.add(obj);
		l.add(new Shop ("Ram",2000,30));
		l.add(new Shop ("Shyam",30000,35));
		l.add(new Shop ("Vishal"30000,35));

	@Override
	public int compare(School o1, School o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
