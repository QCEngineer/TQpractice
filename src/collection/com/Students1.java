package collection.com;

public class Students1 implements Comparable<Students1>{
	
	int id;String iName;float iCost;
	
	
	Students1(){}
	Students1(int id,String iName,float iCost)
	{
		this.id = id;
		this.iName = iName;
		this.iCost = iCost;
	}
	
	public String toString()
	{
		return id+" "+iName+" "+iCost;
	}
	
	public int compareTo(Students1 i)
	{
		if(this.iCost<i.iCost)
			return +1;
		else if(this.iCost>i.iCost)
			return -1;
		else
			return 0;
	}
	
	public boolean equals(Object obj) 
	{
        if(this == obj)
        {
        	return true;
        }
	   if(obj==null || this.getClass() != obj.getClass()) 
	   {
		return false;
	   }
	   Students1 i=(Students1)obj;
	   return this.id==(i.id) && this.iName.equals(i.iName) && this.iCost==(i.iCost);
    }

}