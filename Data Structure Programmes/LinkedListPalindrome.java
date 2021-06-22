// ckeck wheather goiven string is palindrome or not using linked list.
import java.util.*;
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
class Link
{
	Node head;
	
	public void insert(int data)
	{
		Node temp= new Node(data);
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
		}
	}
	public void Delete()
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
	public boolean PalindromeCheck()
	{
		Node temp=head;
		Node last=head;
		
		while(head!=null)
		{
			while(last.next!=null)
		{
			last=last.next;
		}
			if(temp.data==last.data)
			{
				Delete();
				temp=temp.next;
			}
			else
			{
				break;
			}
            return true;			
		}
		return false;
	}
}


class LinkedListPalindrome
{
	public static void main(String args[])
	{
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String : ");	 
	  String str=sc.next();
	 
	  char name [] = str.toCharArray();
	   int len=name.length;
	  Link list = new Link();
	  for(int i=0; i<len;i++)
	  {
		  list.insert(name[i]);
	  }
	  boolean result = list.PalindromeCheck();
	  if(result==true)
	  {
		  System.out.println("Given string is Palindrome");
	  }
	  else
	  {
		  System.out.println("Given string is not Palindrome");
	  }
	  
	}
}

