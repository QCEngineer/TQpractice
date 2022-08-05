package couplingPractice;

public interface Car 
{
	
	public void drive(String s,String d);
	

}
class ACCar implements Car
{
	String make,color;
	
	public ACCar(String make,String color)
	{
		this.make= make;
		this.color = color;
		
	}
	public void drive(String s,String d)
	{
		System.out.println("I am Driving AC Car from "+ s + " to "+ d);
		enjoyYourJurney(s,d);
		
	}
	public void enjoyYourJurney(String s,String dest)
	{
		System.out.println("I am enjoyng jouney ... ");
		
	
	}
	
}
class NonACCar implements Car
{
	String make,color;
	
	public NonACCar(String make,String color)
	{
		this.make= make;
		this.color = color;
		
	}
	public void drive(String s,String d)
	{
		System.out.println("I am Driving Non AC Car from "+ s + " to "+ d);
		enjoyYourJurney(s,d);
	}
	public void enjoyYourJurney(String s,String d)
	{
		System.out.println("I am enjoyng jouney ... ");
		
	
	}
	
}
