//5.A recursive Java palindrome checker

import java.util.*;
class Recursion4
{
	static int sum=0;
	public static int Palindr(int n)
	{

		if(n>0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			return Palindr(n/10);
		}
		return sum;
		
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int x=Palindr(n);
		if(n==x)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is not Palindrome");
		}
		
	}
}