//21. Write a Java program to convert a decimal number to octal number.
import java.util.Scanner;
class Q21

{
	public static void main(String args[])
	{
		int oct=0, r, j=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int dec =sc.nextInt();
		
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