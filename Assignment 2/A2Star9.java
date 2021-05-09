import java.util.Scanner;
class A2Star9

{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=i ; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int k=1; k<=i ; k++)
			{
				System.out.print(" ");
			}
			for(int b=4; b>=i ; b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}