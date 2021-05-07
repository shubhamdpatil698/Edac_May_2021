//24. Write a Java program to convert a binary number to a Octal number.

import java.util.Scanner;
class Q24

{
	public static void main(String args[])
	{
		int dec=0, rem, i=1;
		int oct=0, r, j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int a =sc.nextInt();
		
		while(a!=0)
		{
			rem = a%10;
			dec = dec + (rem * i);
			i = i * 2;
			a = a/10;
		}
		System.out.println("decimal no."+dec);
		while(dec!=0)
		{
			r = dec%8;
			oct = oct + (r * j);
			j = j * 10;
			dec = dec/10;
	
		}
		System.out.println("Octal no."+oct);
	}
}