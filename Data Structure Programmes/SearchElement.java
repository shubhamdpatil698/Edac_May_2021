import java.util.*;

public class SearchElement {
	 public static int SearchEle(int Arr[],int x)
	 { 
		 int temp=0;
		 
		 for(int i=0;i<Arr.length;i++)
		 {
			 if(Arr[i]==x)
				 temp=i;
				
		
		 } return temp;
	 }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many element you want add : ");
		int size=sc.nextInt();
		int [] Arr=new int[size];
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search : ");
		int s=sc.nextInt();
		
		System.out.println("Index Of Element :"+SearchEle(Arr,s));
		
		
	}

}
