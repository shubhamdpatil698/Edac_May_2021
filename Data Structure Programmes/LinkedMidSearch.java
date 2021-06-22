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
	public void MidElement()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else{
			int mid=count/2;
			if(count%2==0)
			{
				for(int i=1;i<mid;i++)
			    {
				temp=temp.next;
			    }
			}
			else{
				for(int i=1;i<=mid;i++)
			    {
				temp=temp.next;
			    }
			}
			
			System.out.println("Middle Element is : "+temp.data);
			
		}
	}
	public void SearchElement(int pos)
	{
		try
		{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
			
		}
		else
		{
			while(temp.data!=pos)
			{
				temp=temp.next;
			}
	        System.out.println("Searched element is at : "+temp);
		}
		}
		catch(Exception ex)
			{
				System.out.println("Searched element is not available in list");
			}
	}
}

class LinkedMidSearch
{
	public static void main(String args[])
	{
		List list=new List();
		list.InsertEnd(10);
		list.InsertEnd(20);
		list.InsertEnd(30);
		//L1.Display();
		//System.out.println();
		List l2=new List();
		//l2.InsertEnd(2);
		l2.InsertEnd(4);
		l2.InsertEnd(6);
		//L2.Display();
		//System.out.println();
		//list.MergeList(l2);
		list.Display();
		list.CountNode();
		list.MidElement();
		list.SearchElement(40);
	}
}