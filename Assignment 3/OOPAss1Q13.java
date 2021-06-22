//13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  

import java.util.Scanner;
import java.lang.*;
class OOPAss1Q13
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number :");
		int first = s.nextInt();
		System.out.println("Enter second number :");
		int second = s.nextInt();
		System.out.println("Enter third number :");
		int third = s.nextInt();
		
		if(first>second && first>third)
		{
			System.out.println("The greatest number is :"+first);
		}
		else if(second>third)
		{
			System.out.println("The greatest number is :"+second);
		}
		else
		{
			System.out.println("The greatest number is :"+third);
		}
	
	}
		
}