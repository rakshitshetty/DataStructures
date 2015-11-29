


public class Node 
{
	int key;
	int data;
	Node leftchild;
	Node rightchild;
	
	Node(int key,int name)
	{
		this.key=key;
		this.data=name;
	}

	public String toString()
	{
		return data+" left child: "+leftchild+" right child: "+rightchild+"\n";
	}
}
