
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int d)
	{
		data=d;
		left=right=null;
	}
	public int getData()
	{
		return data;
	}
	public TreeNode getLeft()
	{
		return left;
	}
	public TreeNode getRight()
	{
		return right;
	}
	public void setData(int d)
	{
		this.data=d;
	}
	public void setLeft(TreeNode left)
	{
		this.left=left;
	}
	public void setRight(TreeNode right)
	{
		this.right=right;
	}
}
class BinaryTree
{
     TreeNode root;
	 public void Insert(int data)
	 {
		 TreeNode tnode =new TreeNode(data)
		 if(root==null)
		 {
			 root= tnode;
		 }
		 else
		 {
			TreeNode temp=root;
            TreeNode prev=null;
			while(temp!=null))
			{
				prev = temp;
				if(data < temp.getData())
				{
					temp=temp.getLeft();
				}
				else{
					temp=temp.getRight();
				}
			}
			if(data<prev.getData());
			{
				prev.setLeft(tnode);
			}
			else
			{
				prev.setRight(tnode);
			}
			
		 }
	 }
	 
	
}
class TreeImplement
{
	
}