package project;

import java.util.Scanner;

public class patient_details extends bmi {

	int age;
	String name;
	String gender;
	
	patient_details()
	{
	
		age=0;
		gender=null;
		name=null;
		points=0;
	}
	patient_details(int age,String name,String gender,float points)
	{
		this.age=age;            //use of "this" keyword.
		this.name=name;
		this.gender=gender;
		this.points=points;
	}
	public void Details_input () {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Input name: ");
	     name = sc.next();
	    System.out.println("\nInput gender: ");
	     gender = sc.next();
	    System.out.println("\nInput age: ");
	     age = sc.nextInt();
	   
		}
	void display() {
		System.out.println("The age is "+ age);
		System.out.println("The name is "+ name);
		System.out.println("The gender is "+ gender);
		System.out.println("The points are "+ points);
	   }
	
	
	  public float details_points(int age,String gender){
		
		  if(age>65 && gender.equals("male"))
		  {
		    points=(float)4.5;
		  //System.out.println(points);
		  }
		  else if(age>65)
		  {
			  points=(float) 1.5;
			 // System.out.println(points);
		  }
		  else if(gender.equals("male"))
		  {
			  points=3;
			  //System.out.println(points);
		  }
		  else
		  {
			  points=0;
		  }
		  return (float)points;
	}
	
	
	
	
}
