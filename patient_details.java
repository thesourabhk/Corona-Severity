package project;

import java.util.Scanner;

public class patient_details extends bmi {

	int age;
	String name;
	String gender;
	
//	patient_details()
//	{
//		age=0;
//		gender=null;
//		name=null;
		
//	}
	void Inti(int age,String name,String gender,float points)
	{
		this.age=age;            //use of "this" keyword.
		this.name=name;
		this.gender=gender;
		this.points=points;
	}
	public void Details_input () {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Input name: ");
	    String  name = sc.next();
	    System.out.println("\nInput gender: ");
	    String gender = sc.next();
	    System.out.println("\nInput age: ");
	    int age = sc.nextInt();
	   
		}
	void display() {
		System.out.println("The age is "+ age);
		System.out.println("The name is "+ name);
		System.out.println("The gender is "+ gender);
		System.out.println("The points are "+ points);
	   }
	
	
	  public float details_points(){
		
		  if(age>65)
	    {
		  points=(float)1.5;
		  System.out.println(points);
	    }
		  else if(gender=="male" || gender=="MALE" || gender=="Male")
		  {
			  points=3;
			  System.out.println(points);
		  }
		  else
		  {
			  points=0;
			  System.out.println(points);
		  }
		  
		  return points;
	}
	  
	
	
}
