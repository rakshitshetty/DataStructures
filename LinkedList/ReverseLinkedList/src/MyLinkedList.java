
public class MyLinkedList 
{
	Node head;
	int size;
	
	MyLinkedList()
	{
		head=new Node(null);
		size=0;
	}
	
	public void addNode(String data)
	{
		Node newNode=new Node(data);
		if(head.data==null)
		{
			head=newNode;
			
		}
		else
		{
			Node current=head;
			
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
		
	}

	
	public void deleteNode(String data)
	{
		if(head.next==null)
		{
			System.out.println("linked list is empty");
		}
		Node current=head;
		Node parent=head;
		while(current.data!=data)
		{
			parent=current;
			current=current.next;
		}
		parent.next=parent.next.next;
	}
	
	public void display()
	{
		if(head.next==null)
		{
			System.out.println("linked list is empty");
		}
		Node current=head;
		
		while(current!=null)
		{
			System.out.print(current.data+" -> ");
			current=current.next;
			
		}
		System.out.println();
	}
	
	public Node reverseList()
	{
		if(head==null ||head.next==null)
		{
			System.out.println("linked list is empty");
		}
		
		
		Node second=head.next;
		Node third=second.next;
		
		second.next=head;
		head.next=null;
		
		if(third==null)
		{
			System.out.println(second.toString());
			return second;
		}
		
		Node currentNode=third;
		Node previousNode=second;
		
		while(currentNode!=null)
		{
			Node nextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		head=previousNode;
		System.out.println(head.toString());
		return head;
	}
}
