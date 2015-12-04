

public class Node 
{
	Node leftChild;
	Node rightChild;
	int key;
	String data;
	
	Node(int key,String data)
	{
		this.key=key;
		this.data=data;
	}
	
	public String toString()
	{
		return "This has data: "+data+" with key "+key;
	}
}
