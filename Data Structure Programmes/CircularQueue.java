package Stack;

public class CircularQueue{
	int cap;
	int front;
	int rear;
	int arr[];
	int count=0;
	CircularQueue(int size){
		cap=size;
		front=0;
		rear=-1;
		arr=new int[size];
	}
	public boolean isEmpty()
	{
		if(count==0)
			return true;
		return false;
	}
	public boolean isFull()
	{
	     if(count==cap)
			 return true;
		 return false;
	}
	public void Enqueue(int data)
	{
		if(isFull()){
			System.out.println("Queue is Full");
		}
		else{
			rear=(rear+1)%cap;
			arr[rear]=data;
			count++;
		}
	}
	public void Dequeue()
	{
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		else if(front==cap)
		{
			front=(front)%cap;
			front++;
			count--;
		}
		else{
			front++;
			count--;
		}
	}
	public void display()
	{
		if(count==0)
			System.out.println("Queue is Empty");
		else
		{
		if(front<rear)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else if(rear < front){
			for(int k=front;k<cap;k++)
			{
				System.out.print(arr[k]+" ");
			}
			for(int j=0;j<=rear;j++)
			{
				System.out.print(arr[j]+" ");
			}
		}
		}
	}
}