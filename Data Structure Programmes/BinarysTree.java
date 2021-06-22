
class Root
{
	int data;
	Root left;
	Root right;
	public Root(int d)
	{
		data=d;
		left=right=null;
	}
}
class BST
{
	Root root;
	BST()
	{
		root=null;
	}
	
	public void Insert(int data)
	{
		root=InsertData(root,data);
	}
	public Root InsertData(Root root,int data)
	{
		if(root==null)
		{
			root=new Root(data);
			return root;
		}
		else
		{
			if(data<root.data)
			{
				root.left=InsertData(root.left,data);
							
			}
			else
			{
				root.right=InsertData(root.right,data);
			}
			return root;
		}
	}
	public void Inorder()
	{
		InorderTraversal(root);
	}
	public void InorderTraversal(Root root)
	{
		if(root!=null)
		{
			InorderTraversal(root.left);
			System.out.print(root.data+" ");
			InorderTraversal(root.right);
		}
	}
	
	///////////////////   Deletion of nodes/////////////////////
	public void Delete(int data)
	{
		root=DeleteData(root,data);
	}
	public Root DeleteData(Root root, int data)
	{
		if(root==null)
		{
			return root;
		}
		if(data<root.data)
		{
			root.left=DeleteData(root.left,data);
		}
		else if (data>root.data)
		{
			root.right=DeleteData(root.right,data);
		}
		else
		{
			if(root.left==null)
		    {
			     return root.right;
		    }
			else if(root.right==null)
			{
				return root.left;
			}
			else
			{
			
			   root.data=minValue(root.right);
			
			 root.right=DeleteData(root.right,root.data);
			}
		}
		return root;
		
	}
	public int minValue(Root root)
	{
		int min=root.data;
		while(root.left!=null)
		{
			min=root.left.data;
			root=root.left;
		}
		return min;
	}
}

class BinarysTree
{
	public static void main(String args[])
	{
		BST tree=new BST();
		tree.Insert(50);
		tree.Insert(20);
		tree.Insert(60);
		tree.Insert(10);
		tree.Insert(15);
		tree.Insert(55);
		tree.Insert(70);
		
		tree.Inorder();
		tree.Delete(50);
		System.out.println();
		tree.Inorder();
	}
}

