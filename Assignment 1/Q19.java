//19. Write a Java program to convert a decimal number to binary number.
import java.util.Scanner;
class Q19
{
	public static void main(String args[])
	{
		int bin=0, rem, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int a =sc.nextInt();
		
		while(a!=0)
		{
			rem = a%2;
			a = a/2;
			bin = bin + rem*i;
			i=i*10;
			
		}
		System.out.println("binary no."+bin);
	
		
	}
}