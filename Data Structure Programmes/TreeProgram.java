import java.util.Scanner;

class TreeNode{
			int data;
			TreeNode left;
			TreeNode right;	

			TreeNode(){
				left = right = null;
			}


			TreeNode(int data){
				this.data = data;
				left = right = null;
			}	


			void print(){
				System.out.print(""+data+">>");;
			}


			int getData(){
				return data;
			}


			TreeNode getLeft(){
				return left;
			}


			TreeNode getRight(){
				return right;
			}


			void setLeft(TreeNode left){
				this.left = left;
			}


			void setRight(TreeNode right){
				this.right = right;
			}
	}


public class TreeProgram {

			TreeNode root;
			public TreeProgram(){
				root = null;
			}
			
			void insert(int data){
				TreeNode tnode = new TreeNode(data);
				if( root == null){
					root = tnode;
				}
				else{
					TreeNode temp = root;
					TreeNode prev = null;
					while( temp != null ){	
						prev = temp;
						if( data < temp.getData())
							temp = temp.getLeft();
						else
							temp = temp.getRight();


					}			
					if( data < prev.getData()){
						prev.setLeft(tnode);
					}else{
						prev.setRight(tnode);
					}
				}			


			}


			

			void inorder(TreeNode root){
				if( root != null){
					inorder( root.getLeft());
					root.print();
					inorder( root.getRight());
				}
			}


			void inorder(){
				//System.out.print("inorder");
				inorder(root);
				System.out.println(">>>");
			}


			TreeNode search(int data){
				TreeNode temp = root;
				while( temp != null && temp.getData() != data ){
					if( data > temp.getData() )
						temp = temp.getRight();
					else
						temp = temp.getLeft();
				}
				return temp;
			}


			TreeNode searchP(int data){
				TreeNode temp = root;
				TreeNode prev = null;	
				while( temp != null && temp.getData() != data ){
					prev = temp;
					if( data > temp.getData() )
						temp = temp.getRight();
					else
						temp = temp.getLeft();
				}
				return prev;
			}






			void DeleteNoChild(TreeNode toBeDeleted){
				if( toBeDeleted == root){
					 toBeDeleted=null;
					root = null;	 
					return;	
				}		
				TreeNode parent = searchP( toBeDeleted.getData() );		
				if( toBeDeleted.getData() < parent.getData() ){
					parent.setLeft(null);
					 toBeDeleted=null;
				}else{
					parent.setRight(null);
					toBeDeleted=null;
				}


			}


			TreeNode RightMost( TreeNode leftSubTree){
				while( leftSubTree.getRight() != null)
					leftSubTree = leftSubTree.getRight();
			return leftSubTree;
			}


			void DeleteOneChild( TreeNode toBeDeleted ){
				if( toBeDeleted == root){
					if( root.getLeft() != null ){
						root =  root.getLeft();
					}else{
						root =  root.getRight();
					}
					toBeDeleted=null;
					return;	
				}	


				TreeNode parent = searchP( toBeDeleted.getData() );
				if( toBeDeleted.getData() < parent.getData() ){
					if( toBeDeleted.getLeft() != null ){
						parent.setLeft( toBeDeleted.getLeft() );
					}else{
						parent.setLeft( toBeDeleted.getRight() );
					}	
				}else{


					if( toBeDeleted.getLeft() != null ){
						parent.setRight( toBeDeleted.getLeft() );
					}else{
						parent.setRight( toBeDeleted.getRight() );
					}	
				}			
				toBeDeleted=null;	  
			}


			void DeleteBothChild( TreeNode toBeDeleted ){
				TreeNode parent = searchP( toBeDeleted.getData() );
				TreeNode lefKaRightMost = RightMost( toBeDeleted.getLeft() );
				lefKaRightMost.setRight( toBeDeleted.getRight() );
				toBeDeleted.setRight(null);


				if( toBeDeleted == root ){
				   root = toBeDeleted.getLeft();
				}else{


					if( toBeDeleted.getData() < parent.getData() ){
					    parent.setLeft( toBeDeleted.getLeft() );	
					}else{
					    parent.setRight( toBeDeleted.getLeft() );	
					}
				}
				toBeDeleted=null;
			}


			void deleteNode(int data){
				TreeNode toBeDeleted = search( data );


				if( toBeDeleted != null ){
					if ( toBeDeleted.getLeft() == null 
							&& toBeDeleted.getRight() == null ){
						DeleteNoChild( toBeDeleted );
					}else if( toBeDeleted.getLeft() != null
							&& toBeDeleted.getRight() != null){
						DeleteBothChild( toBeDeleted );


					}else{
						DeleteOneChild( toBeDeleted );
					}
				}
				else{
					System.out.println("Data not found");
				}		
			}


			void search(){
			}

	public static void main(String args[]){
		TreeProgram tree=new TreeProgram();
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		while( true ){
			n=sc.nextInt();
			if( n == -1){
				break;
			}	
			tree.insert(n);
		}	
		//tree.BFT();
		//tree.DFT();
		tree.inorder();	

		
		System.out.println("Enter the value to delete");
		while( true ){
			 n=sc.nextInt();
			if( n == -1){
			
				break;
			}
			tree.deleteNode( n );
			tree.inorder();	
			
		} 	


		
	}}
	




