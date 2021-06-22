class TwoStack{
	private int S[];
	private int Size;
	private int top1;
	private int top2;
	int mid;
	
	public TwoStack(int Size)
	{
		this.Size=Size;
		S=new int [Size];
		top1=-1;
		mid = S.length/2;
	    top2 = mid;
	}
	
	public void pushFirst(int j)
	{
		if(isFullF())
		{
			System.out.println("First Stack is Full");
		}
		else
		{
		S[++top1]=j;
		}
	}
	public int popFirst()// we want that return  value
	{
		if(isEmptyF())
		{
			System.out.println("First Stack is Empty");
			return 0;
		}
		else
		{
		  return S[top1--];
		}
	}
	public int peekFirst()// top element of Stack
	{
		return S[top1];
	}
	public boolean isEmptyF()
	{
		return (top1 == -1);// condtion for underflow
	}
	public boolean isFullF()
	{
		return (top1 == mid);// condition for Overflow
	}
	
	
	////////////Second Stack///////////////
	public void pushSecond(int j)
	{
		if(isFullS())
		{
			System.out.println("Second Stack is Full");
			
		}
		else
		{
		
		S[++top2]=j;
		}
	}
	public int popSecond()// we want that return  value
	{
		if(isEmptyS())
		{
			System.out.println("Second Stack is Empty");
			return 0;
		}
		else
		{
		return S[top2--];
		}
	}
	public int peekSecond()// top element of Stack
	{
		return S[top2];
	}
	public boolean isEmptyS()
	{
		return (top2 == mid);// condtion for underflow
	}
	public boolean isFullS()
	{
		return (top2 == Size-1);// condition for Overflow
	}
	public void displayFirst()
	{
		for(int i=0; i<=mid;i++)
			System.out.println(S[i]);
	}
	public void displaySecond()
	{
		for(int i=mid+1; i<Size;i++)
			System.out.println(S[i]);
	}
}
class MidStackArray
{
	public static void main(String args[])
	{
		TwoStack ts= new TwoStack(5);
		ts.pushFirst(10);
		ts.pushFirst(20);
		ts.pushFirst(30);
		ts.pushFirst(40);
		ts.displayFirst();
		System.out.println();
		ts.pushSecond(30);
		ts.pushSecond(40);
		//ts.pushSecond(50);
		ts.displaySecond();
		System.out.println();
	}
}