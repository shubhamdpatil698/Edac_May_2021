import java.util.Scanner;
class A2Star10

{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=5 ; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}