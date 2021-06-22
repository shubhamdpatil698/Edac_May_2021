
class QueueImple
{
	int cap;
	int arr[];
	int num;
	int front;
	int rear;
	
	public QueueImple(int size)
	{
		cap=size;
		arr= new int[size];
		front=0;
		rear=-1;
	}
	public boolean isEmpty()
	{
		return front==cap;
	}
	public boolean isFull()
	{
		return rear==cap;
	}
	public void Enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		arr[++rear]=data;
	}
	public void Dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		rear--;
	}
	public void display()
	{
		for(int i=0;i<rear+1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


class Queue
{
	public static void main(String args[])
	{
		QueueImple q=new QueueImple(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Dequeue();
		q.display();
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		
	}
}
