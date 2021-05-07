import java.util.Scanner;
class A2Pat7

{
	public static void main(String args[])
	{
		int a=1;
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
					System.out.print(" "+a);
					a++;
				}
			}
			a=1;
			System.out.println();
		}
				
	}
}