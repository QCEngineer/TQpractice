package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import collection.com.Students1;

class Employee {
	int empID,depID;
	float salary;
	String eName;

	Employee (){}

	Employee (String e ,int a ,int b,float s)
	{

		this.eName=e;
		this.empID=a;
		this.depID=b;
		this.salary=s;

	}
	public String toString()
	{
		return eName +" , " +empID+ " , "+depID +" , "+salary;
	}

}

public class Employee_HashMap {
	

	ArrayList<Employee> l = new ArrayList<>();

	public void addEle()
	{
		l.add(new Employee("Arvind",1100,011,20000.0f));
		l.add(new Employee("ajay",1100,022,15000.5f));
		l.add(new Employee("vijay",1300,033,100000.0f));
		l.add(new Employee("shyam",1400,044,20000.5f));
		
		System.out.println(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, String> hm=new HashMap<Employee, String>();

		Employee o = new Employee("Abc ",1100,011,25.2f);
		Employee o1 = new Employee("Arvind " ,1100,022,50.2f);

		
		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());

		// System.out.println(o2.hashCode());



		hm.put(o, "First");
		hm.put(o1, "Second");

		System.out.println(hm);


	}

}
