package hashSet;

import java.util.*;

public class Basic_HashSetEx01 {
	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<>();

		hset.add(10);
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(60);
		hset.add(570);

        Iterator<Integer> it = hset.iterator();

		System.out.println("Iterate HashSet using iterator : ");
		while (it.hasNext()) {

			System.out.print(it.next());
		}
	}
}
