//25. Write a Java program to convert a octal number to a decimal number..

import java.util.Scanner;
class Q25

{
	public static void main(String args[])
	{
		int dec=0, rem, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int a =sc.nextInt();
		
		while(a!=0)
		{
			rem = a%10;
			dec = dec + (rem * i);
			i = i * 8;
			a = a/10;
		}
		System.out.println("decimal no."+dec);
	
	}
}