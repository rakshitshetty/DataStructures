

public class BST 
{
	Node root;
	int count=0;
	
	public void addNode(Node newNode)
	{
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			Node focusNode=root;
			Node parent;
			
			while(true)
			{
				parent=focusNode;
				if(newNode.key<focusNode.key)
				{
					focusNode=focusNode.leftchild;
					if(focusNode==null)
					{
						
						parent.leftchild=newNode;
						
						return;
					}
				}
				else
				{
					focusNode=focusNode.rightchild;
					if(focusNode==null)
					{
						parent.rightchild=newNode;
						
						return;	
					}
				}
			}
		}
	}
	public void addNode(int key,String name)
	{
		Node newNode=new Node(key,name);
		
		if(root==null)
		{
			root=newNode;
		}
		else
		{
			Node focusNode=root;
			Node parent;
			
			while(true)
			{
				parent=focusNode;
				if(key<focusNode.key)
				{
					focusNode=focusNode.leftchild;
					if(focusNode==null)
					{
						parent.leftchild=newNode;
						return;
					}
				}
				else
				{
					focusNode=focusNode.rightchild;
					if(focusNode==null)
					{
						parent.rightchild=newNode;
						return;	
					}
				}
			}
		}
	}
	
	public void inorderTraversal(Node focusNode)
	{
		if(focusNode!=null)
		{
			inorderTraversal(focusNode.leftchild);
			System.out.println(focusNode);
			
			inorderTraversal(focusNode.rightchild);
		}
	}
	
	public void preorderTraversal(Node focusNode)
	{
		if(focusNode!=null)
		{
			System.out.println(focusNode);
			preorderTraversal(focusNode.leftchild);
			
			
			preorderTraversal(focusNode.rightchild);
		}
	}	
	
	public void postorderTraversal(Node focusNode)
	{
		if(focusNode!=null)
		{
			
			postorderTraversal(focusNode.leftchild);
			
			
			postorderTraversal(focusNode.rightchild);
			System.out.println(focusNode);
		}
	}	
	
	public Node findNode(int key)
	{
		Node focusNode=root;
		while(focusNode.key!=key)
		{
			if(key<focusNode.key)
			{
				focusNode=focusNode.leftchild;
			}
			else
			{
				focusNode=focusNode.rightchild;
			}
			if(focusNode==null)
			{
				return null;
			}
		}
		return focusNode;
	}
	
	
	
//////////////////////////////////////////////////	
	
	
	
	public boolean remove(int key)
	{
		Node focusNode=root;
		Node parent=root;
		
		boolean isItLeft=true;
		
		while(focusNode.key!=key)
		{
			parent=focusNode;
			if(key<focusNode.key)
			{
				isItLeft=true;
				focusNode=focusNode.leftchild;
			}
			else
			{
				isItLeft=false;
				focusNode=focusNode.rightchild;
			}
			if(focusNode==null)
			{
				return false;
			}
		}
		if(focusNode.leftchild==null && focusNode.rightchild==null)
		{
			if(focusNode==root)
			{
				root=null;
			}
			else if(isItLeft)
			{
				parent.leftchild=null;
			}
			else
			{
				parent.rightchild=null;
			}
		}
		else if(focusNode.rightchild==null)
		{
			if(focusNode==root)
			{
				root=focusNode.leftchild;
			}
			else if(isItLeft)
			{
				parent.leftchild=focusNode.leftchild;
			}
			else
			{
				parent.rightchild=focusNode.leftchild;
			}
		}
		else if(focusNode.leftchild==null)
		{
			if(focusNode==root)
			{
				root=focusNode.rightchild;
			}
			else if(isItLeft)
			{
				parent.leftchild=focusNode.rightchild;
			}	
			else
			{
				parent.rightchild=focusNode.rightchild;
			}
		}
		else
		{
			Node replacement =getReplacementNode(focusNode);

			if(focusNode==root)
			{
				root=replacement;
			}
			else if(isItLeft)
			{
				parent.leftchild=replacement;
			}	
			else
			{
				parent.rightchild=replacement;
			}
			replacement.leftchild=focusNode.leftchild;
		}
		return true;
	}
	
	public Node getReplacementNode(Node replaceNode)
	{
		Node replacementParent=replaceNode;
		Node replacement=replaceNode;		
		Node focusNode=replaceNode.rightchild;	
		
		while(focusNode!=null)
		{
			replacementParent=replacement;
			replacement=focusNode;
			focusNode=focusNode.leftchild;
		}
        if (replacement != replaceNode.rightchild) {

	            replacementParent.leftchild = replacement.rightchild;
	            replacement.rightchild = replaceNode.rightchild;
	 
	        }
	 
        return replacement;
	}
	
	

}
