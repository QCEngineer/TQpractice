package class_practice;

public class SocietyStatic {

		static String sName ;
		static int societyNumber;
		int x=10;
		
		SocietyStatic (){}
		
		SocietyStatic(String s, int p ) 
		{
		sName=s;
		societyNumber=p;
		}
		
		public static  void showSocietyDetails () {
			
			System.out.println(sName+" OmSai Apartment " + societyNumber);
		}
		
		static class Flat 
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
		static void Audit () {
			
			static String name;
			
			
		}

		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
