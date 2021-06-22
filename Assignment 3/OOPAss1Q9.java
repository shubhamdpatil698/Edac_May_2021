/*09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print them.*/

import java.util.Scanner;
import java.lang.*;
class OOPAss1Q9
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter days :");
		int days = s.nextInt();
		
		int years=(days/365);
		
		int months=(days%365)/30;
		
		days=(days%365)%30;
		
		System.out.println("Years are :"+years);
		System.out.println("Months are :"+months);
		System.out.println("Days are :"+days);
	
	}
		
}