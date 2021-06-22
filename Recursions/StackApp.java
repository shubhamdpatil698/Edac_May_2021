
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
		for(int i=0; i<size;i++)
			System.out.println(S[i]);
	}
}
class StackApp
{
	public static void main (String args[])
	{
		Stack s1= new Stack(5);
		s1.push(23);
		s1.display();
		s1.push(10);
		s1.push(40);
		s1.push(25);
		s1.display();
	}
}