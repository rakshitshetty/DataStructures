

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
		
		rak.inorderTraversal(rak.root);
		System.out.println();
		
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
		
		Node successor=raks.commonAncestor(raks.root, e, b);
		System.out.println(successor.toString());
		
		//System.out.println(rak.findNode(30));
	}
}
