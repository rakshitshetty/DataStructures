


public class ImplementLinkedList {

	public static void main(String[] args) 
	{

		
//		MyLinkedList rak=new MyLinkedList();
//		rak.add("b");
//		rak.add("b");
//		rak.add("b");
//		rak.add("a");
//		rak.add("a");
//		rak.add("a");
//		rak.add("f");
//		rak.add("a");
//		rak.add("b");
//		rak.add("c");
//		rak.add("d");
//		rak.add("b");
//		rak.add("c");
		
		//rak.display();
//		rak.nthToLastNode(2);
		//rak.removeDuplicates();
//		rak.search("e");
//		rak.remove("c");
//		listItem node=new listItem("f");
//		rak.deleteNode(node);
		//rak.display();
//		MyLinkedListInt a=new MyLinkedListInt();
//		MyLinkedListInt b=new MyLinkedListInt();
//		a.add(3);
//		a.add(1);
//		a.add(5);
//		b.add(5);
//		b.add(9);
//		b.add(2);
//		addLinkedList(a, b);
		circularLinkedList();
		

	}
	
	
	
	public static void circularLinkedList()
	{
		MyLinkedList track=new MyLinkedList();
		
		
		
		listItem a=new listItem("a");
		listItem b=new listItem("b");
		listItem c=new listItem("c");
		listItem d=new listItem("d");
		listItem e=new listItem("e");
		listItem f=new listItem("f");
		track.head.setNext(a);
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		f.setNext(c);
		//track.display();
		listItem current1=track.head.getNext();
		listItem current2=track.head.getNext().getNext();
		
		
		while(current1!=current2)
		{
			current2=current2.getNext().getNext();
			current1=current1.getNext();
		}
		System.out.println(current2.getData());
		
		current1=track.head;
		while(current1!=current2)
		{
			current2=current2.getNext();
			current1=current1.getNext();
		}
		System.out.println(current1.getData());
		
	}
	
	
	public static void addLinkedList(MyLinkedListInt a,MyLinkedListInt b)
	{
		listItemInt head1=a.head;
		listItemInt head2=b.head;
		
		MyLinkedListInt sum=new MyLinkedListInt();
		
		listItemInt current1=head1;
		listItemInt current2=head2;
		listItemInt sumpointer=sum.head;
		System.out.println();
		sum.add(0);
		sumpointer=sumpointer.getNext();
		
		while(current1.getNext()!=null && current2.getNext()!=null)
		{
			
			current1=current1.getNext();
			current2=current2.getNext();
			
			
			
			int unit=(current1.getData()+current2.getData()+sumpointer.getData())%10;
			System.out.println("units: "+unit);
			int tens;
			if(current1.getData()+current2.getData()+sumpointer.getData()>=10)
			{
				tens=1;
				
			}
			else
			{
				tens=0;
			}
			
			
			System.out.println("tens:"+tens);

			sumpointer.setData(unit);
			if(current1.getNext()!=null)
			{
			sum.add(tens);
			}
			sumpointer=sumpointer.getNext();
			
			
		}
		sum.display();
		
		
	}

}
