package hashSet;


public class Item implements Comparable<Item>
{
	int itemId;
	String itemName;
	float cost;
	Item(){}
	public Item(int itemid, String itemName, float cost)
	{
		this.itemId = itemid;
		this.itemName = itemName;
		this.cost = cost;
	}
	
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", cost=" + cost + "]";
	}
	
	public int compareTo(Item i1)
	{
		if(itemId < i1.itemId)
				return -1;
		else if (itemId > i1.itemId)
			  return 1;
		else return 0;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode() called");
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + itemId;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals() called");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (itemId != other.itemId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}
	

}


