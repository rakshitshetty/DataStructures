

public class bst 
{
	Node root=null;
	int count=0;
	
	public void addNode(int key,String data)
	{
		Node newNode=new Node(key,data);
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			Node parent=root;
			Node focusnode=root;
			
			while(focusnode!=null)
			{
				parent=focusnode;
				
				if(key<=focusnode.key)
				{
					focusnode=focusnode.leftChild;
					if(focusnode==null)
					{
						parent.leftChild=newNode;
					}
				}
				else 
				{
					focusnode=focusnode.rightChild;
					if(focusnode==null)
					{
						parent.rightChild=newNode;
					}
				}
			}
		}
	}
	
	public void inorderTraversal(Node root)
	{
		
		if(root!=null)
		{
			inorderTraversal( root.leftChild);
			System.out.println(root.toString());
			inorderTraversal(root.rightChild);
		}
	}
	
	public void preorderTraversal(Node root)
	{
		
		if(root!=null)
		{
			System.out.println(root.toString());
			preorderTraversal( root.leftChild);
			
			preorderTraversal(root.rightChild);
		}
	}
	public void postorderTraversal(Node root)
	{
		if(root!=null)
		{
			
			preorderTraversal( root.leftChild);
			
			preorderTraversal(root.rightChild);
			System.out.println(root.toString());
		}
	}
	
	public void search(int key)
	{
		if(root==null)
		{
			System.out.println("there are no nodes in the tree");
		}
		else if(key==root.key)
		{
			System.out.println("element found at the root of the tree");
		}
		else
		{
			Node focusnode=root;
			while(true)
			{
				if(focusnode==null)
				{
					System.out.println("key not present in tree");
					break;
				}
				else
				{
					if(focusnode.key==key)
					{
						System.out.println("node found with data "+focusnode.data);
						break;
					}
					else if(key<focusnode.key)
					{
						focusnode=focusnode.leftChild;
					}
					else
					{
						focusnode=focusnode.rightChild;
					}
				
				}
				
			}
			
		}
	}
	
	
	public void deleteNode(int key)
	{
		Node focusnode=root;
		Node parent=root;
		boolean isitLeft=false;
		while(focusnode.key!=key)
		{
			parent=focusnode;
			if(key<focusnode.key)
			{
				focusnode=focusnode.leftChild;
				isitLeft=true;
			}
			else
			{
				focusnode=focusnode.rightChild;
				isitLeft=false;
			}
			if(focusnode==null)
			{
				System.out.println("the node you want to delete doesnot exist in the tree");
				return;
			}
		}
		
		if(focusnode.leftChild==null && focusnode.rightChild==null)
		{
			if(focusnode==root)
			{
				root=null;
			}
			else if(isitLeft)
			{
				parent.leftChild=null;
			}
			else
			{
				parent.rightChild=null;
			}
		}
		else if(focusnode.leftChild==null)
		{
			if(focusnode==root)
			{
				root=focusnode.rightChild;
			}
			else if(isitLeft)
			{
				parent.leftChild=focusnode.rightChild;
			}
			else
			{
				parent.rightChild=focusnode.rightChild;
			}
		}
		else if(focusnode.rightChild==null)
		{
			if(focusnode==root)
			{
				root=focusnode.leftChild;
			}
			else if(isitLeft)
			{
				parent.leftChild=focusnode.leftChild;
			}
			else
			{
				parent.rightChild=focusnode.leftChild;
			}
		}
		else
		{
			Node replaceNode=getReplacement(focusnode);
			if(focusnode==root)
			{
				root=replaceNode;
			}
			else if(isitLeft)
			{
				parent.leftChild=replaceNode;
			}
			else
			{
				parent.rightChild=replaceNode;
			}
			replaceNode.leftChild=focusnode.leftChild;
		}
		System.out.println("node deleted");
		
	}
	
	public Node getReplacement(Node replaceNode)
	{
		Node replacement=replaceNode;
		Node parent=replaceNode;
		Node focusnode=replaceNode;
		focusnode=focusnode.rightChild;
		
		while(focusnode!=null)
		{
			parent=replacement;
			replacement=focusnode;
			focusnode=focusnode.leftChild;
		}
		
		if(replacement!=replaceNode.rightChild)
		{
			
			parent.leftChild=replacement.rightChild;
			replacement.rightChild=replaceNode.rightChild;
		}
		return replacement;
		
	}
	
//	public boolean checkIfBalanced()
//	{
//		
//		return (maxDepth(root)-minDepth(root)<=1);
//	}
//	
//	public int maxDepth(Node root)
//	{
//		if(root==null)
//		{
//			return 0;
//		}
//		return 1+Math.max(maxDepth(root.leftChild),maxDepth(root.rightChild));
//	}
//	
//	public int minDepth(Node root)
//	{
//		if(root==null)
//		{
//			return 0;
//		}
//		return 1+Math.min(minDepth(root.leftChild),minDepth(root.rightChild));
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean checkIfBalanced()
	{
		return ((maxDepth(root)-minDepth(root))<=1);
	}
	
	public int maxDepth(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+(Math.max(maxDepth(root.rightChild),maxDepth(root.leftChild) ));
	}
	
	public int minDepth(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+(Math.min(minDepth(root.rightChild),minDepth(root.leftChild) ));
	}
}
