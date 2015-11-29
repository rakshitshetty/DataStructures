
public class Node 
{
	String data;
	Node next;
	
	Node(String data)
	{
		this.data=data;
		this.next=null;
	}
	Node(String data,Node next)
	{
		this.data=data;
		this.next=next;
	}
	
	public String toString()
	{
		return data+" ->"+next;
	}

}
