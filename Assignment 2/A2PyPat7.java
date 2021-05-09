import java.util.Scanner;
class A2PyPat7

{
	public static void main(String args[])
	{
	
		int a=9;
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=9; k>=i ; k--)
			{
				System.out.print(a+" ");
			}
			a--;
			System.out.println();
			
		}	
		
	}
}