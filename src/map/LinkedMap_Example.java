package map;

import java.util.LinkedHashMap;

public class LinkedMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Google";


		LinkedHashMap <Character, Integer> hm = new LinkedHashMap<Character , Integer>();

		for (int i=0;i < str.length(); i++) 
		{
			if (hm.containsKey(str.charAt(i)))
			{
				Integer cr =hm.getOrDefault(str.charAt(i),0);
				hm.put(str.charAt(i), cr+1);

			}
		}
		System.out.println(hm);
	}
}
