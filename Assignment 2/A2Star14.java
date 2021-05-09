import java.util.Scanner;
class A2Star14

{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=2; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int a=5; a>=i ; a--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=2; i<=5; i++)
		{
			for(int k=4; k>=i ; k--)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=i ; b++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
				
	}
}