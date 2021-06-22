//11.	Write a program to swap two numbers without using third variable.
import java.util.Scanner;
import java.lang.*;
class OOPAss1Q11
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number:");
		int first = s.nextInt();
		System.out.println("Enter second number:");
		int second = s.nextInt();
		second=first+second;
		first=second-first;
		second=second-first;
		System.out.println("Swapping of two numbers :"+first+" "+second);
	
	}
		
}