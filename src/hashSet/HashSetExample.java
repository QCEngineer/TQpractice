package hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class HashSetExample {

	public static void main(String[] args) {
	Set<Integer> s = new HashSet<>();
		s.add(34);
		s.add(35);
		s.add(4543);
		s.add(12);
		s.add(12);
		s.add(null);
		System.out.println("Set s is : " + s);
		
		Set<Integer> s2 = new HashSet();
		s2.add(34);
		s2.add(35);
		s2.add(99);
	System.out.println("Set s2 is : " + s2);
		
	 //    s.addAll(s2); // Union
	 //System.out.println("After adding s2 to s (union) " + s);
	     
	//s.removeAll(s2);  // difference
	//System.out.println("After removing s2 from s :" + s);
		
	//s.retainAll(s2); // It gives intersection
	//System.out.println("After retaining s2 in set s (intersection) : " + s );
	//System.out.println("Contains all : "+s.containsAll(s2)); 
		
	//System.out.println("S : " + s);

	Student st1 = new Student(11,"KKK");
	Student st2 = new Student(11,"KKK");

		
		Set<Student> ss = new HashSet();
		ss.add(st1);ss.add(st2);
		System.out.println(ss + "\n___________________"); 
		
		 
		//Iterating HashSet
	System.out.println("Iterating HashSet using iterator()");
	Iterator<Student> i  = ss.iterator();
	while(i.hasNext())
		System.out.println(i.next());
	System.out.println("\n___________________");
	
	
	
	
	}

}
