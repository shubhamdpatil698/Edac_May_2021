/*04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .*/
import java.util.Scanner;
class OOPAss1Q4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first variable");
		byte first=sc.nextByte();
		System.out.println("Enter the second variable");
		byte second=sc.nextByte();
		
		byte third = (byte)(first+second);
		System.out.println("Result is :"+third);
	}
}