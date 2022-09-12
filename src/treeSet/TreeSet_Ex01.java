package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Ex01 {

	public static void main(String[] args){

		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(6);
		ts.add(9);

		Iterator<Integer> iterator = ts.iterator();

		System.out.print("TreeSet: ");

		while (iterator.hasNext())

			System.out.print(iterator.next() + ", ");

		System.out.println();
	}
}
