package abstract_practice;
abstract class Food
{
	abstract public void prepareFood();
	abstract public void ingradients();
	
	public void parcelFood (String s)
	{
		System.out.println(" The Parcel Food is "+s);
	}
}

class Paratha extends Food
{
	 public void prepareFood()
	 {
	    System.out.println(" Prepare Paratha "); 
	    parcelFood(" Paratha ");
	 }
	 
	 public void ingradients()
	 {
	     System.out.println(" Ingradients : wheat flour , salt , Water & Ghee or Oil ");  
	 }
}

class Noodels extends Food
{
	 public void prepareFood()
	 {
	    System.out.println(" Prepare Noodels "); 
	    parcelFood(" Noodels ");
	 }
	 
	 public void ingradients()
	 {
	     System.out.println(" Ingradients : wheat flour , rice flour ");  
	 }
}
public class Hotel {

	public static void main(String[] args)
	{
		Food f = new Paratha();
		f.prepareFood();
		f.ingradients();
		
		Food f1 = new Noodels();
		f1.prepareFood();
		f1.ingradients();

	}

}