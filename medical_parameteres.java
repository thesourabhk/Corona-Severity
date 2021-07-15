package project;
import java.util.Scanner;
public class medical_parameteres extends bmi {
	String Dyspnea;
	int N_count;   //Neutrophil count
	int L_count;	//lymphocyte count
	int CRP;	//C-reactive protein.
	
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
	    String  Dyspnea = sc.next();
	    System.out.println("Enter Neutrophil Count (per UL): ");
	    int N_count =sc.nextInt();
	    System.out.println("Enter Lymphocyte Count (per UL)  ");
	    int L_count = sc.nextInt();
	    System.out.println("Enter C- Reactive Protein. (CRP) (mg/L)  ");
	    int CRP = sc.nextInt();
	    inflammatory_points();
	   
		}
	
	public float inflammatory_points()
	{
		if(N_count>=8000)
		{
			points=3;
			System.out.println(points);
		}
		else if(L_count<1000)
		{
			points=(float)1.5;
			System.out.println(points);
		}
		else  if(CRP>=100 && CRP<200)
		{
			points=2;
			System.out.println(points);
		}
		else if(CRP>=200)
		{
			points=(float)5.5;
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
