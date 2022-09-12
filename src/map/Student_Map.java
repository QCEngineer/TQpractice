package map;

import java.util.HashMap;
import java.util.Iterator;

class Student {
	int rno,marks;
	String sName;

	Student (){}

	Student (String s ,int a ,int b)
	{

		this.sName=s;
		this.rno=a;
		this.marks=b;
	}
	public String toString()
	{

		return sName +" , " +rno+ " , "+marks;
	}

	public int hashCode ()
	{
		int a =0;
		a=rno+(marks*2)+sName.hashCode();
		return a ;
	}

	public boolean  equalas (Object o)
	{
		if (this == o)
			return true ;
		if (o == null)
			return false ;
		if (this.getClass()!=o.getClass())
			return false ;

		Student s =(Student)o;

		if (this.rno == s.rno && this.marks == s.marks && this.sName.equals(s.sName))
			return false ;

		else 
			return false ;

	}

}

class Student_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, String> hm=new HashMap<Student, String>();

		Student o = new Student("Arvind " ,1000,1);
		Student o1 = new Student("Arvind " ,1000,1);

		//	Student o2 = new Student("vishal", 2000,2);

		System.out.println(o.hashCode());
		System.out.println(o1.hashCode());

		// System.out.println(o2.hashCode());



		hm.put(o, "First");
		hm.put(o1, "Second");

		System.out.println(hm);


	}

}
