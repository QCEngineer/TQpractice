package interfacePractice;
interface Edit
{
	void read();
	void update();
	//void write();
	
	default void write()
	{
		System.out.println(" Write method ");
	}

}
interface Printable 
{
   void print();
}

class Book 
{
   int bId , cost;
   String bName ;
   Book () {}
   Book( int bId, String bName , int cost)
   {
	   this.bId=bId;
	   this.bName=bName;
	   this.cost=cost;
   }
   
   public void publish( String publication)
   {
	 System.out.println(" Publication = "+publication);
   }
   
   public String toString()
   {
	   return " Book id = "+bId+" Book name = "+bName+" Book cost = "+cost;
	  
   }
}


class Magzine extends Book implements Edit
{

	public void read()
	{
		System.out.println(" Read Magzine ");
	}
	
	public void update()
	{
		System.out.println(" Uadate Magzine ");
	}

	public void write()
	{
		System.out.println(" Writing the Magzine topic ");
	}
}

class Newspaper implements Edit , Printable       // 2 Different interface implements
{
	public void read()
	{
		System.out.println(" Read Newspaper");
	}
	
	public void update()
	{
		// write();   Without overriding the write() method direct calling
		System.out.println(" Uadate Newspaper");
		
	}

	public void write()
	{
    	System.out.println(" Writing the Newspaper topic ");
	}
	
	public void print()
	{
		System.out.println(" Printing the Newspaper ");
	}
	
}
public class PrintingPress {

	public static void main(String[] args) {
		
		Edit e = new Magzine();
		System.out.println(" This is Magzine class ");
		e.read();
		e.update();
		e.write();
		
	    e = new Newspaper();                                //  For Edit interface 
	    System.out.println("\nThis is News Paper class ");
		e.read();
		e.update();
		e.write();
		
		Printable p = new Newspaper();                      //  For Printable interface 
		p.print();
		

		Book b = new Book( 1," Maths ", 200);   // Magazine class Inherits Book class & interface Edit implements in class Book
		System.out.println("\nThis is Book class ");
	    b.publish(" XYZ ");
		
		e = new Magzine();
		System.out.println(b.toString());
		
		
	}

}


