package treeMap;
import java.util.*;
import java.util.concurrent.*;

public class TreeMap_Practice01 {

	static void TreeMap_Pra() {

		TreeMap<Integer, String> tmap= new TreeMap<Integer, String>();

		tmap.put(10, "Arvind");
		tmap.put(15, "raj");
		tmap.put(20, "vishal");
		tmap.put(25, "ajay");
		tmap.put(30, "vijay");

		System.out.println("TreeMap: " + tmap);
	}

	public static void main(String[] args)
	{
		System.out.println("TreeMap ,.......................................");

		// Calling constructor
		TreeMap_Pra();
	}
}
