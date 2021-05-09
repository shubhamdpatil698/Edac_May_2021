import java.util.Scanner;
class A2Pat18

{
	public static void main(String args[])
	{
	
		int b=64;
		for(int i=1; i<=5; i++)
		{
			int a=1;
			for(int j=5; j>=i ; j--)
			{
				System.out.print((char)(a+b)+" ");
				a++;
			}
			System.out.println();
			
		}	
		
	}
}