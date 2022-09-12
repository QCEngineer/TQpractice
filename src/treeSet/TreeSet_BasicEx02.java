package treeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_BasicEx02 {

	public static void main(String[] args){

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(6);
		ts.add(9);

		System.out.println("TreeSet : "+ts);

		TreeSet<Integer> ts1 = new TreeSet<>(Collections.reverseOrder());

		ts1.add(5);
		ts1.add(20);
		ts1.add(11);
		ts1.add(40);
		ts1.add(6);
		ts1.add(9);

		System.out.println("Reverse Order TreeSet :"+ts1);

	}
}
