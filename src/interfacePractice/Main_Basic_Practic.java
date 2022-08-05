package interfacePractice;

class Base {
	 public final void show() {
	 System.out.println("Base::show() called");
	 }
	}
	class Derived extends Base {
//		 public void show()                            Error ;- Cannot override the final method from Base
//		 {
//		 System.out.println("Derived::show() called");
//		 }
	}
	
public class Main_Basic_Practic {

	public static void main(String[] args) 
	{
		Base b = new Derived();
		 b.show();
		 

	}

}