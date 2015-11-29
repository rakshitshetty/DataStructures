import java.util.Hashtable;


public class MyLinkedList 
{
	listItem head;
	int listcount;
	
	MyLinkedList()
	{
			head=new listItem(null);
			listcount=0;
	}
	
	public void add(String data)
	{
		listItem newNode=new listItem(data);
		
		listItem temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		listcount++;
		
	}
	
	
	public void add(String data,int index)
	{
		listItem newNode=new listItem(data);
		
		listItem temp=head;
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
		listItem toShow=head;
		while(toShow.getNext()!=null)
		{
			toShow=toShow.getNext();
			System.out.print( toShow.getData()+"->"+" ");
			
		}
		System.out.println();
	
	}
	
	public void search(String key)
	{
		listItem see=head;
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
		listItem remove=head;
		
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
	
	public void removeDuplicates()
	{
		listItem current=head;
		listItem pointer=head;
		listItem parent=head;
		
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
							
							pointer=pointer.getNext();
							
							
						}
						else
						{
							parent.setNext(null);
							break;
						}
					}
					else
					{
						
					
					parent=pointer;
					pointer=pointer.getNext();
					}
					
			}
			
		}
	}
	
	public void removeDuplicatesBuffer()
	{
		listItem parent=head;
		listItem current=head.getNext();
		Hashtable<String, Boolean> table=new Hashtable<String, Boolean>();
		
		
		while(current!=null)
		{
			
			
			
			
			if(table.containsKey(current.getData()))
			{
					parent.setNext(current.getNext());
					
					
				
			}
			else
			{
				table.put(current.getData(), true);
				parent=current;
			}
			current=current.getNext();
			
			
			
		}
	}
	
	public void nthToLastNode(int i)
	{
		listItem current=head;
		int size=0;
		
		while(current.getNext()!=null)
		{
			current=current.getNext();
			size++;
		}
		System.out.println("size " +size);
		
		int toFind=size-i+1;
		
		listItem found=head;
		for(int j=0;j<toFind;j++)
		{
			found=found.getNext();
		}
		System.out.println("the element you are looking for is "+found.getData());
	}
	
	public void deleteNode(listItem node)
	{
		if(node.getNext()==null)
		{
			
			node=null;
		}
		else
		{
			while(node.getNext()!=null)
			{
				node.setData(node.getNext().getData());
				
				node=node.getNext();
			}
			node=null;
		}
		listItem toShow=head;
		while(toShow.getNext()!=null)
		{
			toShow=toShow.getNext();
			System.out.print( toShow.getData()+"->"+" ");
			
		}
		System.out.println();
		
	}

		
	
	
	
}
