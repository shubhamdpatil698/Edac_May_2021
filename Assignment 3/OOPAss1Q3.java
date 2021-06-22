/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/
import java.util.Scanner;
import java.lang.*;
import java.io.*;
class OOPAss1Q3
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any random value : ");
		int x=s1.nextInt();
		
		 int y = ((int)(Math.pow(x,2)) + (3 * x)- 7);
		System.out.println("Value of y is : "+y);
		
		y = x++ + ++x;
		System.out.println("Value of x and y are : "+x+" "+y);
		
		String z = Integer.toString(x++ - --y - --x + x++);
		System.out.println("Value of x , y and z are : "+x+" "+y+" "+z);
		
	     z = Boolean.toString((x==x) && (y==y) || !((x==x) || (y==y)));
		 
		System.out.println("Value of z :"+Boolean.parseBoolean(z));
	}

}