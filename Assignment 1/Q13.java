//13. Write a Java program to print the area and perimeter of a rectangle.
import java.util.Scanner;
class Q13
{
	public static void main(String args[])
	{
		float b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Integer:");
		float a = sc.nextFloat();
		float d = sc.nextFloat();
		b = 2*(a+d);
		System.out.println("Perimeter of rectangle:"+b);
		c = ( a * d);
		System.out.println("Area of rectangle:"+c);
	
	
		
	}
}