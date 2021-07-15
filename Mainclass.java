package project;

public class Mainclass {

	public static void main( String args[] )
    {
      
    
	bmi a= new bmi();
	patient_details b= new patient_details();
	medical_parameteres c= new medical_parameteres();
	
	a.calculate_bmi();
	a.bmi_points();
	
	b.Details_input();
	System.out.println(b.age);
	b.details_points();
	c.Inflammatory_Details_input();
	c.inflammatory_points();
	
    }
	
}
