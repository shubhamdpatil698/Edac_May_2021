//3.Calculate a factorial in Java with recursion

import java.util.*;
class Recursion2
{
	public static int factorial(int n)
	{
		if(n<=0)
		{
			return 1;
			
		}
		
		return n*factorial(n-1);
		
	}


	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}