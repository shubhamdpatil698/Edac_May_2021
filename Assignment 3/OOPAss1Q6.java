/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/

import java.util.Scanner;
import java.lang.*;
class OOPAss1Q6
{
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of radius :");
		double radius = s.nextFloat();
		double area, circumference;
		
		area = (Math.PI)*radius*radius;
		
		circumference = 2*(Math.PI)*radius;
		
		System.out.println("Area of Circle is :",area);
		System.out.println("Circumference of Circle is :",circumference);
	}
}