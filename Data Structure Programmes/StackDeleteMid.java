//Delete the Middle element

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
	public void push(int data)
	{
		if(top==size)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			arr[++top]=data;
		}
	}
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			return arr[top--];
		}
	}
	
	public int popMid(Stack s1)
	{
		int temptop=top;
		Stack s2= new Stack(size);
		
		int mid=(top+1)/2;
		
		for(int i=0;i<mid;i++)
		{
			s2.push(pop());
		}
		int temp =pop();
		for(int i=0;i<mid;i++)
		{
			push(s2.pop());
		}
		return temp;
	}
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}

class StackDeleteMid
{
	public static void main(String args[])
	{
		
		Stack slist = new Stack(5);
		slist.push(10);
		slist.push(20);
		slist.push(30);
		slist.push(40);
	    slist.push(50);
		slist.display();
		System.out.println();
		int peekelement=slist.popMid(slist);
		slist.display();
		System.out.println("Peek element is "+peekelement);
		
	}
}