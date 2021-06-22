//2.Write a program to print the roll number and average marks of 8 students in three subjects (each out
//of 100). The marks are entered by user.
import java.util.*;

class Students
{
	int SRoll;
	int Sub1;
	int Sub2;
	int Sub3;
	float AMarks;
	
	static Scanner sc = new Scanner(System.in);
	Students(){}
	
	Students(int SRoll, int Sub1, int Sub2,int Sub3,float AMarks)
	{
		this.SRoll=SRoll;
		this.Sub1=Sub1;
		this.Sub2=Sub2;
		this.Sub3=Sub3;
		this.AMarks=AMarks;
	}
	
	Students AddData()
	{
		
		System.out.println("Enter the Student Roll Number :");
		int Roll=sc.nextInt();
		
		System.out.println("Enter the Student first subject Marks out of 100 :");
		int S1=sc.nextInt();
		
		System.out.println("Enter the Student second subject Marks out of 100 :");
		int S2=sc.nextInt();
		
		System.out.println("Enter the Student third subject Marks out of 100 :");
		int S3=sc.nextInt();
		
		float AMark = ((S1+S2+S3)/3);
		
		return new Students(Roll,S1,S2,S3,AMark);
		
	}
    void Display(Students desp)
    {
    		System.out.println(String.format("Student Roll No.: %d\n Student First Subject Marks :%d\n Student second Subject Marks :%d\n Student third Subject Marks :%d\n Total average marks :%3.2f",desp.SRoll,desp.Sub1,desp.Sub2,desp.Sub3,desp.AMarks));
    		
    }
}





public class AssQ2 {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
		Students s=new Students();
		
		
		
		System.out.println("-----------Enter the Students details----------");
		System.out.println("Enter the how many students data you want add :");
		int N = sc.nextInt();
		Students Slist[]=new Students[N];
		for(int i=0; i<Slist.length;i++)
    	{
    		Slist[i]=s.AddData();
    	}
		
		for(int i=0 ;i<Slist.length;i++)
		{
			s.Display(Slist[i]);
		}
		
	}

}
