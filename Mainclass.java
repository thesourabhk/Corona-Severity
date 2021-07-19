package project;

public class Mainclass extends Thread{

	private static final String String = null;

	public static void main( String args[] ) throws InterruptedException {
      
		
	
	bmi a= new bmi();
	project.patient_details b= new project.patient_details();
	medical_parameteres c= new medical_parameteres();
	
	
	a.calculate_bmi();
	a.bmi_points();
	
	
	b.Details_input();
	//System.out.println();

	//b.display();
	System.out.println(b.age);

	float ans=b.details_points(b.age,b.gender);
	System.out.println(ans);
	Thread.sleep(5000);
	b.display();
	c.Inflammatory_Details_input();
	float ans2=c.inflammatory_points(c.Dyspnea,c.N_count,c.L_count,c.CRP);
	System.out.println(ans2);
	
    }
	
}
