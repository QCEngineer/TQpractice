package throw_Practice;


class vaccine extends Throw_Practice_basic 
{
	public  String getMessage()
	{
		return "Age not Applicable For Vaccination " ;
		
		
	}
}
class VaccinatedPerson { 
	
	String name;
	int age;
	VaccinatedPerson (String name,int age )
 {
		this.name=name;
		this.age=age;	
 }	
}


public class Throw_Practice_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VaccinatedPerson a = new VaccinatedPerson ("Arind",24);
		

	}

}
