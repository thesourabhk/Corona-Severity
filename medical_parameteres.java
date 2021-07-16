package project;
import java.util.Scanner;
public class medical_parameteres extends bmi {
	String Dyspnea;
	int N_count;   //Neutrophil count
	int L_count;	//lymphocyte count
	int CRP;
	  //C-reactive protein.
	
	medical_parameteres()
	{
		Dyspnea=null;
		N_count=0;                   //default Constructor
		L_count=0;
		CRP=0;
	}
	void Intitialize(String Dyspnea,int N_count,int L_count,float points)
	{
		this.Dyspnea=Dyspnea;
		this.N_count=N_count;
		this.L_count=L_count;
		this.points=points;
	}
	
	public void Inflammatory_Details_input () {
		Scanner sc = new Scanner(System.in);      //inputting the inflammatory details.
	    System.out.println("If you are facing shortness of breath at time of admission , Type -YES: ");
	     Dyspnea = sc.next();
	    System.out.println("Enter Neutrophil Count (per UL): ");
	     N_count =sc.nextInt();
	    System.out.println("Enter Lymphocyte Count (per UL)  ");
	     L_count = sc.nextInt();
	    System.out.println("Enter C- Reactive Protein. (CRP) (mg/L)  ");
	     CRP = sc.nextInt();
	   
	   
		}
	
	public float inflammatory_points(String Dyspnea,int N_count,int L_count,int CRP)
	{
		
		if(Dyspnea.equals("yes") &&  N_count>=8000 && L_count<1000 && CRP>=100 && CRP<200)
		{
			points=10;
			//System.out.println(points);
		}
		else if(Dyspnea.equals("yes") &&  N_count>=8000 && L_count<1000 && CRP>=200)
		{
			points=(float)13.5;
			//System.out.println(points);
		}
		else  if(Dyspnea.equals("no") &&  N_count>=8000 && L_count<1000 && CRP>=100 && CRP<200)
		{
			points=(float)6.5;
			//System.out.println(points);
		}
		else if(Dyspnea.equals("no") &&  N_count>=8000 && L_count<1000 && CRP>=200)
		{
			points=10;
			//System.out.println(points);
		}
		else if(Dyspnea.equals("yes") &&  N_count<8000 && L_count<1000 && CRP>=100 && CRP<200)
		{
			points=7;
			//System.out.println(points);
		}
		else if(Dyspnea.equals("no") &&  N_count<8000 && L_count<1000 && CRP>=100 && CRP<200)
		{
			points=7;
			//System.out.println(points);
		}
		
		return points;
	}
	
	
}
