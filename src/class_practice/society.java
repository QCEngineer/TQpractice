package class_practice;

abstract class ClubHouse {

	abstract public void conductGames ();

}
public class society 
{
	String sName ;
	int societyNumber;

	society (){}

	society(String s, int p ) 
	{
		sName=s;
		societyNumber=p;
	}

	public  void showSocietyDetails () {

		System.out.println(sName+" OmSai Apartment " + societyNumber);
	}

	class Flat 
	{

		int fnum;
		String rooms;

		Flat (){}

		Flat(int f,String r){
			fnum=f;
			rooms=r;
		}
		public void flatDetails () {
			showSocietyDetails();

			System.out.println("First Floor "+"\nAll Are Two BHK");

		}

		public void function ( ) {


			// ClubHouse obj = new ClubHouse () 

			new ClubHouse () { 


				public void conductGames() {

					System.out.println("Dance Compitation");

				}
			}.conductGames();

		}

	}


	// public static void main(String[] args) {
	// TODO Auto-generated method stub


}

