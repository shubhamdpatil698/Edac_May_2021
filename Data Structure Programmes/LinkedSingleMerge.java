
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
int count=1;
	public  void Insert(int d)
	{
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
		count++;
	}
	public  void Display()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print("("+n.data+")"+"--->");
			n=n.next;
		}
	}
	public void InsertEnd(int d)
	{
		Node temp = new Node(d);
		Node n=head;
		if(head==null)
		{
			head=temp;
		}
		else{
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=temp;
		count++;
		}
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
		
		count++;
	}
	public void DeleteFront()
	{
	Node temp=head;
	head=temp.next;
	count--;
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
	count--;
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
	count--;
	}
	public void DeleteAll()
	{
		head=null;
		count=0;
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
	public void MergeList(List l2)
	{
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=l2.head;
		count=count+l2.count;
	}
	public void CountNode()
	{
		System.out.println("Total number of Nodes are : "+count);
	}
	public List Compare(List l2)
	{
		List l3=new List();
		Node temp1 =head;
		Node temp2=l2.head;
		while(temp1.next!=null)
		{
			while(temp2.next!=null)
			{
				if(temp1.data==temp2.data)
				{
					l3.Insert(temp1.data);
				}
				temp1=temp1.next;
				temp2=temp2.next;
			}
		}
		return l3;
	}
}

class LinkedSingleMerge
{
	public static void main(String args[])
	{
		List list=new List();
		list.InsertEnd(10);
		list.InsertEnd(20);
		list.InsertEnd(30);
		list.Display();
		System.out.println();
		List l2=new List();
		l2.InsertEnd(2);
		l2.InsertEnd(4);
		l2.InsertEnd(6);
		L2.Display();
		System.out.println();
		//list.MergeList(l2);
		//list.Display();
		//list.CountNode();
		List l4=new List();
		l4=list.Compare(L2);
		l4.Display();
		
	}
}