package treeMap;

import java.util.TreeMap;

public class TreeMap_BasicPractice {

	public static void main(String[] args) {
		TreeMap<String, Integer> tmap = new TreeMap<>();

		tmap.put("aaaa", 11);
		tmap.put("bbbb", 22);
		tmap.put("cccc", 33);

		System.out.println("TreeMap : " + tmap);

		// Using entrySet()
		System.out.println("Key or Value of mappings: " + tmap.entrySet());

		// Using keySet()
		System.out.println("Keys : " + tmap.keySet());

		// Using values()
		System.out.println("Values : " + tmap.values());


		// Using get()
		int value1 = tmap.get("cccc");
		System.out.println("Using get(): " + value1);

		// Using getOrDefault()
		int value2 = tmap.getOrDefault("bbbb", 22);
		System.out.println("Using getOrDefault(): " + value2);


		// remove method with single parameter
		int value = tmap.remove("bbbb");
		System.out.println("Removed value: " + value);

		// remove method with two parameters
		boolean result = tmap.remove("cccc", 33);
		System.out.println("Is the entry {Three=3} removed? " + result);


		// Using replace()
		tmap.replace("bbbb", 22);
		tmap.replace("cccc", 3, 33);
		System.out.println("TreeMap using replace: " + tmap);

		// Using replaceAll()
		tmap.replaceAll((key, oldValue) -> oldValue + 2);
		System.out.println("TreeMap using replaceAll: " + tmap);




		System.out.println("Updated TreeMap: " + tmap);

	}
}
