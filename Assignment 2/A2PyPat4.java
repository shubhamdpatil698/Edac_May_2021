import java.util.Scanner;
class A2PyPat4

{
	public static void main(String args[])
	{
	
		for(int i=1; i<=9; i++)
		{
			for(int j=8; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i ; k++)
			{
				System.out.print(k);
			}
			for(int a=i-1; a>=1; a--)
			{
				System.out.print(a);
			}
			System.out.println();
			
		}
		
		
	}
}