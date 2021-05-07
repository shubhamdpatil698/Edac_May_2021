import java.util.Scanner;
class A2Pat9

{
	public static void main(String args[])
	{
		int a=1,b=64;
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
					
                    System.out.print(" "+(char)(a+b));
					a++;
				}
			}
			a=1;
			System.out.println();
		}
				
	}
}