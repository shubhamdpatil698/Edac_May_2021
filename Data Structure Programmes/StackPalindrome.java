// Check wheather string is palindrome or not using Stack
import java.util.*;
class Stack{
	private int S[];
	private int Size;
	private int top;
	
	public Stack(int Size)
	{
		this.Size=Size;
		S=new int [Size];
		top=-1;
	}
	public void push(int j)
	{
		S[++top]=j;
	}
	public int pop()// we want that return  value
	{
		return S[top--];
	}
	public int peek()// top element of Stack
	{
		return S[top];
	}
	public boolean isEmpty()
	{
		return (top == -1);// condtion for underflow
	}
	public boolean isFull()
	{
		return (top == Size-1);// condition for Overflow
	}
	public void display()
	{
		for(int i=0; i<Size;i++)
			System.out.println(S[i]);
	}
}


class StackPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		char name[]=str.toCharArray();
		
		int result=palindromecheck(name);
		
		if(result==1)
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
		
	}
		public static int palindromecheck(char arr[])
		{
			int i=0;
			int le=arr.length;
			Stack st = new Stack(le);
			
		     for(int j=0; j<le;j++)
		     {
			     st.push(arr[j]);
		      }
		      while (i<le)
		      {
			  int check = st.pop();
			 
			 if(check!=arr[i])
			 {
				 return 0;
			 }
			 i++;
		 }
		 return 1;
		}
	
	
}
