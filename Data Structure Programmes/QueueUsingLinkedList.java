// Implementation of Queue using Linked List

class Node
{
	int data;
	Node next;
	
	public Node(int d)
	{
		data=d;
		next=null;
	}
}
class Implements
{
	Node head;
	public void Enqueue(int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
			temp.next=null;
		}
		else
		{
			Node pointer=head;
			while(pointer.next!=null)
			{
				pointer=pointer.next;
			}
			pointer.next=temp;
			temp.next=null;
		}
		
	}
	public void Dequeue()
	{
		Node pointer=head;
		if(head==null)
		{
			//System.out.println("Queue is Empty");
			return;
		}
		else
		{
			pointer=head.next;
			head.next=null;
			head=pointer;
		}
	}
	public void display()
	{
		Node pointer=head;
		if(head==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			while(pointer!=null)
			{
				System.out.print(pointer.data+" ");
				pointer=pointer.next;
			}
			System.out.println();
		}
		
	}
	
}

class QueueUsingLinkedList
{
	public static void main(String args[])
	{
		Implements que=new Implements();
		que.Enqueue(10);
		que.Enqueue(20);
		que.Enqueue(30);
		que.Enqueue(40);
		que.display();
		que.Dequeue();
		que.Dequeue();
		que.Dequeue();
		que.Dequeue();
		que.Dequeue();
		que.display();
		
		
	}
	
}