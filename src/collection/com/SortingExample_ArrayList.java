package collection.com;
import java.util.*;


public class SortingExample_ArrayList{

	public void sortNumber()
	{
		ArrayList<Integer> al = new ArrayList<>();
	    al.add(11);
	    al.add(2);
	    al.add(7);
	    al.add(3);

	    System.out.println("Before Sorting: "+ al);

		
	}
	
  public static void main(String args[]){
    
	  SortingExample_ArrayList obj =new SortingExample_ArrayList();
	  
	  obj.sortNumber();
	  
	      Collections.sort(al);

    System.out.println("After Sorting: "+ al);
  }
}