import java.util.Scanner;
class A2Pat12

{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=1 ; j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" "+i);
					
				}
			}
			System.out.println();
		}
				
	}
}