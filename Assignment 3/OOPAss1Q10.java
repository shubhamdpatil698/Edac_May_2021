//10.	Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
import java.util.Scanner;
import java.lang.*;
class OOPAss1Q10
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature :");
		float fahrenheit = s.nextFloat();
		
		float celsius=5*(fahrenheit-32)/9;
		System.out.println("Celsius Temperature :"+celsius);
	
	}
		
}