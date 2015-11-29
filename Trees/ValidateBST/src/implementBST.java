

public class implementBST 
{
	public static void main(String[] args)
	{
		BST rak=new BST();
	
		rak.addNode(50, "1");
		rak.addNode(25, "2");
		rak.addNode(15, "3");
		rak.addNode(30, "4");
		rak.addNode(75, "5");
		rak.addNode(85, "6");
		
//		rak.inorderTraversal(rak.root);
//		System.out.println();
		
		BST raks=new BST();
		Node a=new Node(50, "1");
		Node b=new Node(25, "2");
		Node c=new Node(15, "3");
		Node d=new Node(30, "4");
		Node e=new Node(75, "5");
		Node f=new Node(85, "6");
		raks.addNode(a);
		raks.addNode(b);
		raks.addNode(c);
		raks.addNode(d);
		raks.addNode(e);
		raks.addNode(f);
		System.out.println(validateBST(raks.root));
		Node l=new Node(24,"a");
		Node m=new Node(60,"b");
		Node n=new Node(40,"c",m,l);
		System.out.println(validateBST(n));

	}
	
	public static boolean validateBST(Node root)
	{

		if(root.leftchild!=null)
		{
			
		
			if(root.leftchild.key<root.key)
			{
				validateBST(root.leftchild);
			}
			else
			{
				return false;
			}
		}
		if(root.rightchild!=null)	
		{
			if(root.rightchild.key>root.key)
			{
				validateBST(root.rightchild);
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
}
