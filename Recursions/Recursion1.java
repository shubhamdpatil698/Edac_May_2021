//2.Sum a series of numbers with Java recursion

import java.util.*;
class Recursion1
{
	static int result=0;
	public static int SeriesNumber(int n,int y)
	{
		if(n<=y)
		{
			result = result+n;
			return SeriesNumber(++n,y);
		}
		return result;
		
	}


	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println(SeriesNumber(1,n));
	}
}