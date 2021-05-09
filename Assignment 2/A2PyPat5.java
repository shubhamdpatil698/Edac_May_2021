import java.util.Scanner;
class A2PyPat5

{
	public static void main(String args[])
	{
	
		int b=9;
		for(int i=1; i<=9; i++)
		{
			for(int j=8; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i ; j++)
			{  
				System.out.print(b);
				b++;
			}
			b=b-i-1;
			int c=8;
			for(int j=2; j<=i; j++)
			{
				System.out.print(c);
				c--;
			}
			System.out.println();
			
		}
		
		
	}
}