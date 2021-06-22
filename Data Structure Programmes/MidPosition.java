public class MidPosition {

	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	public void insertBeg(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node == null)
		{
			System.out.println("Previous element can not be null");
		return;
		}
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void append(int new_data)
	{
		Node new_node = new Node(new_data);
		if(head == null)
		{
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		
		}
		temp.next = new_node;
	}
	
	public int count()
	{
		Node temp = head;
		int count = 0;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("Length of list: "+count);
		return count;
	}
	
	public void midElement()
	{
		int count = 0;
		Node temp = head;
		while(temp != null)
		{
			temp = temp.next;
			count++;
		}
		System.out.println("Mid position: "+count/2);
		
		Node n = head;
		if(count % 2 == 0)
		{
			for(int i=1; i<count/2; i++)
			{
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
	
	public void displayEvenOdd()
	{
		Node temp1 = head;
		Node temp2 = head;
		int count1 = 1;
		int count2 = 2;
		System.out.println("Odd position:");
		while(temp1 != null)
		{
			if(count1%2==1)
			{
				System.out.println(temp1.data+" ");
			}
			temp1 = temp1.next;
			count1++;
		}
		System.out.println("Even position:");
		while(temp2 != null)
		{
			if(count2%2==1)
			{
				System.out.println(temp2.data+" ");
			}
			temp2 = temp2.next;
			count2++;
		}
	}
	
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data+" ");
			n = n.next;
		}
		
	}
	
	public static void main(String[] args) {
		MidPosition m = new MidPosition();
		m.insertBeg(12);
		m.insertBeg(45);
		m.insertBeg(14);
		m.insertBeg(49);
		m.insertAfter(m.head.next, 50);
		m.insertAfter(m.head.next.next, 60);
		m.append(56);
		m.display();
		m.count();
		System.out.println("=================");
		m.midElement();
		m.displayEvenOdd();
	}

}