package map;

import java.util.HashMap;
import java.util.Set;

public class MapPractice_01 {

	HashMap<String,Integer > sm;
	
	public MapPractice_01 ()
	{
	sm=new HashMap<String,Integer>();
	System.out.println("Map Is : ");
	}
	
	public void mapStudent ()
	{
		sm.put("Arvind",100);
		sm.put("Vishal",200);
		sm.put("Amol",300);
		sm.put("Raj",400);
		sm.put("Tom",500);
		
		Set<String> set = sm.keySet();
		
		System.out.println("Key Sets : "+set);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MapPractice_01 obj =new MapPractice_01();
		obj.mapStudent();

	}

}
