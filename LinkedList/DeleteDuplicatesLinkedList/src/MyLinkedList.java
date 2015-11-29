import java.util.HashSet;


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
	
	
	public void add(String data,int index)
	{
		Node newNode=new Node(data);
		
		Node temp=head;
		for(int i=1;i<index && temp.getNext()!=null;i++)
		{
			temp=temp.getNext();
		}
		newNode.setNext(temp.getNext());
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
	
	public void search(String key)
	{
		Node see=head;
		int count=0;
		for(int j=0;j<listcount;j++)
		{
			see=see.getNext();
			if(see.getData()==key)
			{
				System.out.println("found");
				 count=1;
				
			}
			
		}
		if(count==0)
		{
			System.out.println("not found");
		}
		
	}
	
	public void remove (String entry)
	{
		Node remove=head;
		
		if(head.getNext().getData()==entry)
		{
			head.setNext(head.getNext().getNext());
		}
		else
		{
			
		
			while(remove.getNext().getData()!=entry)
			{
				
				remove=remove.getNext();

				
				
			}
			remove.setNext(remove.getNext().getNext());
			listcount--;
		}
		
	}
	
	public void deleteDuplicatesBuffer()
	{
		HashSet<String> set=new HashSet<String>();
		Node parent=head;
		Node current=head.getNext();
		while(current!=null)
		{
			
			
			if(set.add(current.getData()))
			{
				set.add(current.getData());
				parent=current;
			}
			else
			{
				parent.setNext(current.getNext());
			}
			current=current.getNext();
			
			
		}
	}
	
	
	public void deleteDuplicates()
	{
		Node parent=head;
		Node current=head;
		Node pointer=head;
		
		while(current.getNext()!=null)
		{
			current=current.getNext();
			pointer=current.getNext();
			parent=current;
			
			while(pointer!=null)
			{
				
				
				if(pointer.getData()==current.getData())
				{
					if(pointer.getNext()!=null)
					{
						parent.setNext(pointer.getNext());
					}
					else
					{
						parent.setNext(null);
					}
				}
				else
				{
					parent=pointer;
				}
				pointer=pointer.getNext();
			}
			
		}
	}
}
