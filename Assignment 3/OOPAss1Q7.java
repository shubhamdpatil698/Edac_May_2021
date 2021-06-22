/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/

import java.util.Scanner;
import java.lang.*;
class OOPAss1Q7
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		int marks[] = new int[5];
		int sum=0;
		for (int i=0; i<5; i++)
		{
			System.out.println("Enter subject marks :");
			  marks[i] = s.nextInt();
			  sum=sum+marks[i];
		}
		float percentage= ((float)(sum)/5);
		System.out.println("[ percentage marks = "+percentage+" % ]");
	
	}
		
}