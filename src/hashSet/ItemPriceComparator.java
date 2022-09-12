package hashSet;
import java.util.Comparator;

public class ItemPriceComparator implements Comparator<Item>
{

	
	public int compare(Item o1, Item o2) {
		if(o1.cost < o2.cost)
			return 1;
		else if(o1.cost > o2.cost)
			return -1;
		else
			return 0;
	}

}