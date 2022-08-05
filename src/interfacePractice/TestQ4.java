package interfacePractice;

import java.util.Scanner;

//Assignment :- Q 4) Create class Person with name,address, age with methods getDetails(), ShowDetails().
//    Create interface TaxPayer with abstract method payTax(). Create class Employee using Person class and TaxPayer.
//    Employee class has empid , basic , hra , da , grossSalary. It has constructor to initialize all instance 
//    variables, methods to display employee details .It also has method calculateSalary(). Create class VP using 
//    Employee class . Override  calculateSalary() method in this class. Write Main method in different class and 
//    use all required functionalities.

interface TaxPayer
{
	void payTax();
}
class Person
{
	String name , address;
	int age;
	
	public void getDetails()
	{
	 Scanner sc = new Scanner (System.in);
	 System.out.println(" Enter Name = ");
	 name = sc.nextLine();
	 System.out.println(" Enter Address = ");
	 address = sc.nextLine();
	 System.out.println(" Enter Age = ");
	 age = sc.nextInt();
	 
	 sc.close();
	}
	

	public void ShowDetails()
	{
	  System.out.println(" ** Person Details ** ");
	  System.out.println(" Name = "+name);
	  System.out.println(" Address = "+address);
	  System.out.println(" Age = "+age);
	}
}

class Employee extends Person implements TaxPayer
{
  int empId ;
  float basic , hra , da , grossSalary;
  
  Employee() {}
  
  Employee( int empId ,float basic ,float hra ,float da)
  {
	 this.empId = empId ;
	 this.basic = basic ;
	 this.hra = hra ;
	 this.da = da; 
  }

  public void calculateSalary()
  {
	  grossSalary = basic+da+hra;  
  }
  
  public void showEmpDetails()
  {
	  System.out.println(" ** Salary Details ** ");
	  System.out.println(" Employee Id = "+empId);
	  System.out.println(" Basic = "+basic);
	  System.out.println(" Dearness Allowance = "+da);  
	  System.out.println(" House Rent Allowance = "+hra);
	  System.out.println(" Gross Salary = "+grossSalary);
  }
  
  
  public void payTax()
  {
	System.out.println(" Your Tax payable amout is "+(grossSalary*0.2));  
  }
  
}

class Vp extends Employee
{
	double bonus = 8000;
	double totalSalary;
	
	Vp()
	{
		super(1,50000.0f, 2800.0f,1800.0f);
		super.calculateSalary();
	}
	 public void calculateSalary()
	  {
		 totalSalary = grossSalary + bonus;
		 System.out.println(" Total Salary = "+totalSalary );
	  }	
}
public class TestQ4 {

	public static void main(String[] args)
	{
		Vp v = new Vp();
		System.out.println(" For Person Details ");
		v.getDetails();
		v.ShowDetails();
		
		System.out.println(" \nFor Salary Details ");
		v.showEmpDetails();
		v.payTax();
		v.calculateSalary();
		
        
	}

}