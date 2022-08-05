package exceptionPractice;
import java.util.Scanner;

/* 
The java.util package provides a Scanner class to take input of primitive 
data types and strings. It is the simplest way to read user input in java.
If the user does not provide the proper type of input or input is out of range, 
then InputMismatchException happens. */

public class InputMismatchException{
	
  int age;
  String name;
  
  public InputMismatchException(String name, int age){
     this.age = age;
     this.name = name;
  }
  public void display() {
	   
     System.out.println("Name of the student is: "+name);
     System.out.println("Age of the student is: "+age);
  }
  public static void main (String args[]){
	   
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter your name: ");
     String name = sc.next();
     System.out.println("Enter your age: ");
     int age = sc.nextInt();
     
     InputMismatchException obj = new InputMismatchException(name, age);
     obj.display();
  }
}