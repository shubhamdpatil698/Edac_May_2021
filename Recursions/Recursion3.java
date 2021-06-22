//4.Print the Fibonacci series with Java and recursion
import java.util.*;
class Recursion3
{
	public static int fibbo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1 || n==1 )
		{
			return 1;
		}
		else
		{
			return fibbo(n-1)+fibbo(n-2);
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		for(int i=0; i<n;i++)
		{
			System.out.print(fibbo(i)+" ");
		}
		
	}
}