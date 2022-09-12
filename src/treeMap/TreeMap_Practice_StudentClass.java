package treeMap;

import java.util.*;
import java.util.concurrent.*;

class Student {

	int rollno , idNum;
	String name;


	Student (){}

	public Student(int rn, String n, int id)
	{
		this.rollno = rn;
		this.name = n;
		this.idNum = id;
	}

	public String toString()
	{
		return this.rollno + " , " + this.name + " , "+ this.idNum;
	}
}

class Sortbyroll implements Comparator<Student> {

	public int compare(Student a, Student b)
	{
		return a.rollno - b.rollno;
	}
}

public class TreeMap_Practice_StudentClass {

	public static void main(String[] args)
	{
		TreeMap<Student, Integer> tmap = new TreeMap<Student, Integer>(	new Sortbyroll());

		tmap.put(new Student(10, "Arvind", 10000), 2);
		tmap.put(new Student(20, "Vishal", 11000), 3);
		tmap.put(new Student(30, "Vijay", 12000), 1);

		System.out.println("TreeMap of Students : " + tmap);


	}
}
