// Implemetation of Stack using queue

class Queue
{
	int cap;
	int front;
	int rear;
	int arr[];
	public Queue(int d)
	{
		cap=d;
		front=0;
		rear=-1;
		arr=new int[d];
	}
	
	public void Enqueue(int data)
	{
		if(rear==cap)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			arr[++rear]=data;
		}
	}
	public int Dequeue()
	{
		if(front==-1)
		{
			System.out.println("Stack is Empty");
			return 0;
		}
		else
		{
			return arr[front++];
		}
		
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
class StackImplem
{
	int top;
	Queue q1;
	Queue q2;
	
    public StackImplem(int d)
	{
		q1=new Queue(d);
	    q2=new Queue(d);
		top=q1.rear;
	}
	
	public void push(int data)
	{
		q1.Enqueue(data);
	}
	public void pop()
	{
		for(int i=q1.front;i<q1.rear;i++)
		{
			int x=q1.Dequeue();
			q2.Enqueue(x);
		}
		q1=q2;
	}
	public void display()
	{
		q1.display();
	}

}


class StackUsingQueue
{
	public static void main(String args[])
	{
		StackImplem sq = new StackImplem(5);
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		sq.push(50);
		sq.display();
		System.out.println();
		sq.pop();
		sq.pop();
		sq.display();
		
	}
}