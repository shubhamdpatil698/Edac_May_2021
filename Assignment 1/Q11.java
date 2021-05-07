//11. Write a Java program to print the area and perimeter of a circle.
import java.util.Scanner;
class Q11
{
	public static void main(String args[])
	{
		double b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Integer:");
		double a = sc.nextDouble();
		b = (Math.PI * a* a);
		System.out.println(b);
		c = (2 * Math.PI * a);
		System.out.println(c);
	
	
		
	}
}