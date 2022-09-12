package linkedMap.com;


import java.util.*;

public class LinkedHashMap_Pra01 {

	public static void main(String args[]){

		LinkedHashMap<Integer, String> hm	= new LinkedHashMap<Integer, String>();

		hm.put(300, "aaaa");
		hm.put(200, "bbbb");
		hm.put(100, "ccccc");

		System.out.println(" Mappings of LinkedHashMap : "+ hm);
	}
}
