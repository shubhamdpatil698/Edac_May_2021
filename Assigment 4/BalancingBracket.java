import java.util.*;
class Stack
{
	int size;
	int top;
	char arr[];
	public Stack(int size)
	{
		this.size=size;
		arr=new char[size];
		top=-1;
	}
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isFull()
	{
		if(top==size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void push(char data)
	{
		arr[++top]=data;
		
	}
	public char pop()
	{
		return arr[top--];
		
	}
}



class BalancingBracket
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		int len=name.length();
		Stack s= new Stack(len);
		boolean ans=true;
		for(int i=0;i<len;i++)
		{
			char ch=name.charAt(i);
			if(ch=='{' || ch=='(' || ch=='[')
				{
					s.push(ch);
				}
			else if(ch=='}' || ch==')' || ch==']')
			{
				char ch1='A';
				if(!s.isEmpty())
				{
					ch1=s.pop();
				}
				else
				{
					ans= false;
				}
				if(ch=='(' && ch1!=')')
				{    ans= false;
				     break;
				}
				if(ch=='{' && ch1!='}')
				{    ans= false;
				     break;
				}
				if(ch=='[' && ch1!=']')
				{    ans= false;
				     break;
				}
				
			}
		}
		if(s.isEmpty()&&ans)
		{
			System.out.println("Balanced Brackets");
		}
		else
		{
			System.out.println("Unbalanced Brackets");
		}
	}
}