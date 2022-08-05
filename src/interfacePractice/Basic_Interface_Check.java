package interfacePractice;
interface X
{
 void methodX();
}
class Y implements X
{
//   void methodX()          Error :-  Cannot reduce the visibility of the inherited method from X
//   {
//	 System.out.println("Method X");
//  }
   public void methodX()
    {
      System.out.println("Method X");
    }
}

public class Basic_Interface_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         X o = new Y();
         o.methodX();
	}

}