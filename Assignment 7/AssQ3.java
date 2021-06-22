//3.Write a program to calculate the average height of all the students of a class. The number of students
//and their heights in a class are entered by user.
import java.util.*;
class Students1
{
	float Stheight;
    static float Sum=0;
	
	Scanner sc= new Scanner(System.in);
	Students1(){}

	Students1(float height, float sum)
	{
        this.Stheight=height;
        this.Sum=sum;
	}
	Students1 AddData()
	{
		System.out.println("Enter the height of student : ");
		float ht=sc.nextFloat();
		
		Sum=Sum+ht;
		return new Students1(ht,Sum);
	}
	
	
}


public class AssQ3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the how students data you want enter : ");
		int N =s.nextInt();
		
		Students1 s1=new Students1();
		Students1 St1 []=new Students1[N];
		
		for(int i=0;i<St1.length;i++)
		{
			System.out.println("Enter the Students Heigth "+i+":");
			St1[i]=s1.AddData();
		}
		System.out.println("The Average heights of students :"+((s1.Sum)/N));
	}
}
