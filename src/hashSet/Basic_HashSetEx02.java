package hashSet;

import java.util.*;

class Laptop {

	int cost;
	String os;

	Laptop(){}

	public Laptop(int cost, String os) {
		this.os = os;
		this.cost = cost;
	}
	public String toString() {
		return "Laptop [cost=" + cost + ", os=" + os + "]";
	}


}

public class Basic_HashSetEx02{

	public void stringchar (String s) {

		String str[]=s.split(" ");

		HashSet<String> hs = new HashSet<>();
		for (int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		Iterator<String> it = hs.iterator();


		while (it.hasNext()) {

			System.out.print(it.next());
	}
	}
	public static void main(String[] args) {

		HashSet<Integer> hset = new HashSet<>();

		hset.add(1);
		hset.add(2);
		hset.add(3);
		hset.add(4);
		hset.add(5);

		Iterator<Integer> it2 = hset.iterator();

		System.out.println("Iterate HashSet using iterator : ");

		while (it2.hasNext()) {

			System.out.print(it2.next());
		}

		HashSet<Laptop> hset1 = new HashSet<>();

		Laptop o =new Laptop(10000,"window 7");
		Laptop o1 =new Laptop(10000,"window 7");
		Laptop o2 =new Laptop(10000,"window 7");
		Laptop o3 =new Laptop(10000,"window 7");

		hset1.add(o);
		hset1.add(o1);
		hset1.add(o2);
		hset1.add(o3);

		Iterator<Laptop> it1 = hset1.iterator();


		while (it1.hasNext()) {

			System.out.print(it1.next());
		}
		Basic_HashSetEx02 a = new Basic_HashSetEx02();

		a.stringchar("today is rainy day day is rainy");

	}
}
