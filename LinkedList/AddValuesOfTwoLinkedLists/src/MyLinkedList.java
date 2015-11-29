
public class MyLinkedList 
{
	Node head;
	int listcount;
	
	MyLinkedList()
	{
			head=new Node(0);
			listcount=0;
	}
	
	public void add(int data)
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
	
	
	public void add(int data,int index)
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
	
	public void search(int key)
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
	
	public void remove (int entry)
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
	
	public void add(MyLinkedList list2)
	{
		MyLinkedList sum=new MyLinkedList();
		
		Node current1=head;
		Node current2=list2.head;
		int units=0,tens=0;
		while(current1.getNext()!=null && current2.getNext()!=null)
		{
			current1=current1.getNext();
			current2=current2.getNext();
			
			int add=(current1.getData()+current2.getData())+tens;
			
			if(add>9)
			{
				units=add%10;
				tens=1;
				sum.add(units);
				
			}
			else
			{
				units=add;
				tens=0;
				sum.add(units);
			}
			
		}
		sum.display();
	}
}
