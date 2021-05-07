//15. Write a Java program to swap two variables.
import java.util.Scanner;
class Q15
{
	public static void main(String args[])
	{
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Integer:");
		int a =sc.nextInt();
		int b =sc.nextInt();
		c = a;
		a = b;
		
		System.out.println("Swapping no.");
		System.out.println(+a+" "+c);
	
		
	}
}