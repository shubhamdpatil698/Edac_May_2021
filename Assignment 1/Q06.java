//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
import java.util.Scanner;
class Q06
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Integer:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println("Addition:"+c);
		int d = a-b;
		System.out.println("Subtraction:"+d);
		int e = a*b;
		System.out.println("Mutiplication:"+e);
		int f = a/b;
		System.out.println("Division:"+f);
		int r = a%b;
		System.out.println("Remainder:"+r);
	
		
	}
}