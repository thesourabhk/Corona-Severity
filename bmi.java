
package project;

import java.util.Scanner;

public class bmi {

	public float points;
	float BMI;

	bmi() {
		BMI = 0;

		points = 0; // default constructor.
	}

	public void calculate_bmi() {
		
		
		
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input weight in kilogram: ");
		float weight = sc.nextFloat();
		System.out.println("\nInput height in meters: ");
		float height = sc.nextFloat();

		
			
		 BMI =  (weight / (height*height));
		 
		 System.out.println("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");
		 
		 
			
		} 
		catch (Exception e) {
			System.out.println("Reached into exception block" + e);
			
		}

	    
	    
	}

	public int bmi_points() {
		if (BMI >= 25 && BMI < 30) {
			points = 2;
			System.out.println(points);
		} else if (BMI >= 30) {
			points = 3;
			System.out.println(points);
		} else {
			points = 0;
			System.out.println(points);

		}
		return (int) points;
	}
}
