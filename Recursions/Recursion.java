//Print the series of numbers with recursive java methods
import java.util.*;
class Recursion
{
	public static int SeriesNumber(int n,int y)
	{
		if(n<y)
		{
			System.out.println(n);
			return SeriesNumber(++n,y);
		}
		return n;
		
	}


	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		System.out.println(SeriesNumber(1,n));
	}
}