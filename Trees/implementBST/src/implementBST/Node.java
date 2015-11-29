package implementBST;

public class Node 
{
	int key;
	String name;
	Node leftchild;
	Node rightchild;
	
	Node(int key,String name)
	{
		this.key=key;
		this.name=name;
	}

	public String toString()
	{
		return name+" has a key "+key;
	}
	
}
