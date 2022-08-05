package couplingPractice;


class Person
{
	int age;
	String name;
	Car c;
	public Person() {}
	public Person(int a,String n,Car c)
	{
		age=a;
		name=n;
	   this.c=c;
	}
	public void planforVacation()
	{
		
		c.drive("Banglore","GOA");
		System.out.println("My vacation os full of Masti...");
	}
}
public class StudyLooseCopuling {

	public static void main(String[] args) 
	{
		NonACCar car = new NonACCar("BMW", "Black");
		Person p = new Person(25,"Mr.X",car);
		p.planforVacation();
		
	}

}
