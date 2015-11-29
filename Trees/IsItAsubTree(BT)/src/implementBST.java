

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
		

		
		BST raks=new BST();
		Node a=new Node(50, "1");
		Node b=new Node(25, "2");
		Node c=new Node(15, "3");
		Node d=new Node(30, "4");
		Node e=new Node(75, "5");
		Node f=new Node(70, "6");
		Node g=new Node(85, "7");
		raks.addNode(a);
		raks.addNode(b);
		raks.addNode(c);
		raks.addNode(d);
		raks.addNode(e);
		raks.addNode(f);
		raks.addNode(g);
		
		BST raks1=new BST();
		Node l=new Node(75, "5");
		Node m=new Node(70, "6");
		Node n=new Node(85, "7");
		raks1.addNode(l);
		raks1.addNode(m);
		raks1.addNode(n);
		
		
		System.out.println(isSubTree(a,l));
	}
	
	public static boolean isSubTree(Node a,Node b)
	{
		if(b==null)
		{
			return true;
		}
		return subTree(a,b);
	}
	
	public static boolean subTree(Node a,Node b)
	{
		if(a==null)
		{
			return false;
		}
		if(a.name==b.name)
		{
			if(matchTree(a,b))
			{
				return true;
			}
		}
		return (subTree(a.leftchild,b)||subTree(a.rightchild,b));

		
	}
	
	public static boolean matchTree(Node a,Node b)
	{
		if(a==null && b==null)
		{
			return true;
		}
		if(a==null || b==null)
		{
			return false;
		}
		if(a.name!=b.name)
		{
			return false;
		}
		return (matchTree(a.leftchild,b.leftchild)&&matchTree(a.rightchild,b.rightchild));
	}
}
