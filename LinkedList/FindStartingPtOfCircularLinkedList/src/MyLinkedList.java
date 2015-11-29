
public class MyLinkedList 
{
	Node head;
	int listcount;
	
	MyLinkedList()
	{
			head=new Node(null);
			listcount=0;
	}
	
	public void add(String data)
	{
		Node newNode=new Node(data);
		
		Node temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		listcount++;
		
	}
	
	public void display()
	{
		Node toShow=head;
		while(toShow.getNext()!=null)
		{
			toShow=toShow.getNext();
			System.out.print( toShow.getData()+"->"+" ");
			
		}
		System.out.println();
	
	}
}
