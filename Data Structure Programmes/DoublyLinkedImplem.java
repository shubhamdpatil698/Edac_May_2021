class Node
{
	int data;
	Node next;
	Node prev;
	
	Node(int x)
	{
		data=x;
		next=null;
		prev=null;
	}
}
class DoubleLL
{
	Node head;
	public void InsertAtStart(int d)
	{
		Node temp=new Node(d);
		temp.next=head;
		temp.prev=null;
		if(head!=null)
		{
			head.prev=temp;
		}
		head=temp;
	}
	public void display()
	{
	Node n=head;
	while(n!=null)
	{
		System.out.print("("+n.data+")"+"--->");
		n=n.next;
	}
	
	}
	public void InsertAtMid(int pos,int d)
	{
		Node temp=new Node(d);
		Node n=head;
		while(n.data!=pos)
		{
			n=n.next;
			
		}
		temp.next=n.next;
			n.next=temp;
			temp.prev=n;
			if(temp.next!=null){
			temp.next.prev=temp;
			}
			
	}
	public void InsertEnd(int d)
	{
		Node temp=new Node(d);
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		 n.next=temp;
		 temp.prev=n;
		temp.next=null;
		
	}
	public void InsertAtPos(int index,int d)
	{
		Node temp=new Node(d);
		Node n=head;
		int i=0;
		if(index==1)
		{
			//temp.next=n;
			//head=temp;
			InsertAtStart(d);
		}
		for( i=2; i<index;i++)
		{
			n=n.next;
		}
		temp.next=n.next;
		n.next=temp;
		temp.prev=n;
		if(temp.next!=null){
			temp.next.prev=temp;
			}
		if(i<0)
		{
			System.out.println("Invalid position");
		}
	}
	public void DeleteAtStart()
	{
		Node n=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			n=n.next;
			head=n;
			n.prev=null;
			
		}
	}
	public void DeleteAtEnd()
	{
		Node n=head;
		Node pre=null;
		if(head==null)
		{
			System.out.println("List is Empty");
			head=n;
		}
		else
		{
			while(n.next!=null)
			{
				n=n.next;
			}
			n=n.prev;
			n.next=null;
		}
	}
	public void DeleteAtMid(int pos)
	{
		Node n=head;
		Node pre=null;
		if(head==null)
		{
			System.out.println("List is Empty");
			head=n;
		}
		else
		{
			while(n.data!=pos)
			{
				pre=n;
				n=n.next;
			}
			pre.next=n.next;
			n.next=pre;
			
			
		}
	}
	public void DeleteAll()
	{
		head=null;
	}
	public void Reverse()
	{
		Node temp=head;
		Node pointer=null;
		if(temp==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			while(temp.next!=null)
			{
				
				temp=temp.next;
			}
			pointer=temp;

			while(pointer.next!=null)
			{
				pointer=pointer.prev;
				System.out.print("("+pointer.data+")"+"--->");
				
			}
			
		}
	}
}


class DoublyLinkedImplem
{
	public static void main(String args[])
	{
		DoubleLL dl=new DoubleLL();
		dl.InsertAtStart(10);
		dl.InsertAtStart(20);
		dl.InsertAtStart(30);
		//dl.display();
		System.out.println();
		//dl.InsertEnd(40);
		
		dl.display();
		System.out.println();
		//dl.display();
		//dl.DeleteAtEnd();
		//dl.DeleteAtMid(20);
		//dl.DeleteAll();
		//dl.display();
		//System.out.println();
		
		//dl.Reverse();
		//dl.display();
		//dl.DeleteAtStart();
		//dl.display();
		//dl.InsertAtPos(5,5);
		//dl.InsertEnd(50);
		//dl.display();
		//System.out.println();
		//dl.InsertAtMid(30,5);
		//dl.display();
		//System.out.println();
		//dl.InsertAtMid(20,90);
		//dl.display();
		//System.out.println();
		//dl.InsertAtMid(30,100);
		dl.Reverse();
		//dl.display();
		
		
		
	}
}