import java.util.Hashtable;


public class MyLinkedListInt 
{

	listItemInt head;
	int listcount;
	
	MyLinkedListInt()
	{
			head=new listItemInt(0);
			listcount=0;
	}
	
	public void add(int data)
	{
		listItemInt newNode=new listItemInt(data);
		
		listItemInt temp=head;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		listcount++;
		
	}
	
	
	public void add(int data,int index)
	{
		listItemInt newNode=new listItemInt(data);
		
		listItemInt temp=head;
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
		listItemInt toShow=head;
		while(toShow.getNext()!=null)
		{
			toShow=toShow.getNext();
			System.out.print( toShow.getData()+"->"+" ");
			
		}
		System.out.println();
	
	}
	
	public void search(int key)
	{
		listItemInt see=head;
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
	
	public void remove (int entry)
	{
		listItemInt remove=head;
		
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
		listItemInt current=head;
		listItemInt pointer=head;
		listItemInt parent=head;
		
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
		listItemInt parent=head;
		listItemInt current=head.getNext();
		Hashtable<Integer, Boolean> table=new Hashtable<Integer, Boolean>();
		
		
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
		listItemInt current=head;
		int size=0;
		
		while(current.getNext()!=null)
		{
			current=current.getNext();
			size++;
		}
		System.out.println("size " +size);
		
		int toFind=size-i+1;
		
		listItemInt found=head;
		for(int j=0;j<toFind;j++)
		{
			found=found.getNext();
		}
		System.out.println("the element you are looking for is "+found.getData());
	}
	
	public void deleteNode(listItemInt node)
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
		listItemInt toShow=head;
		while(toShow.getNext()!=null)
		{
			toShow=toShow.getNext();
			System.out.print( toShow.getData()+"->"+" ");
			
		}
		System.out.println();
		
	}

		
	
	
	
}
