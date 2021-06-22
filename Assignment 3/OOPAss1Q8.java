/*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.*/

import java.util.Scanner;
import java.lang.*;
class OOPAss1Q8
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter priciple amount :");
		float amount = s.nextFloat();
		System.out.println("Enter rate of interest :");
		float rate = s.nextFloat();
		System.out.println("Enter time required :");
		float time = s.nextFloat();
		
		float simpleInterest = (amount*rate*time)/100;
		System.out.println("Simple interest is "+simpleInterest);
	
	}
		
}