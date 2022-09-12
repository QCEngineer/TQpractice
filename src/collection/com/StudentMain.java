package collection.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentMain {

	ArrayList<Students1> l = new ArrayList<>();

	public void addEle()
	{
		l.add(new Students1(101,"phone",20000.0f));
		l.add(new Students1(103,"Ac",15000.5f));
		l.add(new Students1(102,"Laptop",100000.0f));
		l.add(new Students1(103,"phone",20000.5f));
		l.add(new Students1(102,"Laptop",100000.0f));
		
		System.out.println(l);
	}

	public void sorting()
	{
		System.out.println("Sorting by price in descending using compareTo : ");
		Collections.sort(l);
		System.out.println(l);
		System.out.println("Sorting price ascending using reverse order : ");
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l);
	}

	public void showOccurence()
	{
		System.out.println();
		ListIterator<Students1> litr = l.listIterator();

		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==null)
				continue;
			int cnt = 1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					cnt++;
					l.set(j,null);
				}
			}
			System.out.println("The name "+l.get(i)+" Occures : "+cnt+" times");
		}
	}


	public static void main(String[] args) {
		
		StudentMain obj = new StudentMain();
		
		obj.addEle();
		//			obj.sorting();
		obj.showOccurence();

	}

}