
import java.util.*;
class Stack
{
	int size;
	int arr[];
	int top;
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	public boolean isEnpty()
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
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else{
			arr[++top]=data;
		}
	}
	public int pop()
	{
		if(isEnpty())
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else{
			return arr[top--];
		}
	}
}

class StringReverseUsingStack
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int len=name.length();
		char nameChar []=name.toCharArray(); 
		Stack strev=new Stack(len);
		for(int i=0;i<len;i++)
		{
			strev.push((int)(nameChar[i]));
		}
		for(int i=0;i<len;i++)
		{
			nameChar[i]=(char)strev.pop();
		}
		for(int i=0;i<len;i++)
		{
			System.out.print((nameChar[i]));
		}
	}
}