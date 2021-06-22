class Node
{
	int data;
	Node next;
     Node(int x)
	{
		data=x;
		next=null;
	}
}

class List{
	
Node head;

	public  void Insert(int d)
	{
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
	}
	public  void Display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	public void InsertEnd(int d)
	{
		Node temp = new Node(d);
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=temp;
	}
	public void InsertM(int pos,int d)
	{
		Node temp = new Node(d);
		Node n=head;
		while(n.data!=pos)
		{
			n=n.next;
		}
		temp.next=n.next;
		n.next=temp;
		
		
	}
	public void DeleteFront()
	{
	Node temp=head;
	head=temp.next;
	}
	public void DeleteLast()
	{
	Node temp=head;
	Node pre=null;
	while(temp.next!=null)
	{
		pre =temp;
		temp=temp.next;
	}
	pre.next=temp.next;
	}
	public void DeleteAfter(int pos)
	{
	Node temp=head;
	Node pre=null;
	while(temp.data!=pos)
	{
		pre =temp;
		temp=temp.next;
	}
	pre.next=temp.next;
	}
	public void Reverse()
	{
		Node n=head;
		Node curr,previ=null;
		
		
		while(n!=null)
			
		{
			curr=n;
			n=n.next;
			curr.next=previ;
			previ=curr;
			head=curr;
		}
	}
}

class LinkedImplem
{
	public static void main(String args[])
	{
		List l=new List();
		l.Insert(10);
		l.Insert(20);
		l.Insert(30);
		l.Display();
		System.out.println();
		l.InsertEnd(40);
		l.InsertEnd(50);
		l.Display();
		System.out.println();
		l.InsertM(10,60);
		l.DeleteFront();
		l.DeleteAfter(40);
		l.Display();
		l.Reverse();
		l.display();
		
		
	}
}