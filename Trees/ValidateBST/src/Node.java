

public class Node 
{
	int key;
	String name;
	Node leftchild;
	Node rightchild;
	Node parent;
	
	Node(int key,String name)
	{
		this.key=key;
		this.name=name;
	}
	
	Node(int key,String name,Node leftchild,Node rightchild)
	{
		this.key=key;
		this.name=name;
		this.leftchild=leftchild;
		this.rightchild=rightchild;
	}

	public String toString()
	{
		return name+" has a key "+key;
	}
	
}
