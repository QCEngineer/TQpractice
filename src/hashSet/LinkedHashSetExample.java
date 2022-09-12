package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
				
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(1000);
		lhs.add(null);
		lhs.add(235);
		System.out.println("Linked HashSet : " + lhs);
		
		HashSet<Integer> s1 = new HashSet<>();
		s1.add(100);
		s1.add(35);
		System.out.println("s1 : " + s1);
		lhs.addAll(s1);
		System.out.println("LinkedHashSet lhs after adding s1) : " + lhs);
		
		Iterator<Integer> i  = lhs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		

	}

}
