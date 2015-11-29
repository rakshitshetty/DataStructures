
public class Test {

	public static void main(String[] args) 
	{
		MyLinkedList track=new MyLinkedList();
		
		
		
		Node a=new Node("a");
		Node b=new Node("b");
		Node c=new Node("c");
		Node d=new Node("d");
		Node e=new Node("e");
		Node f=new Node("f");
		track.head.setNext(a);
		a.setNext(b);
		b.setNext(c);
		c.setNext(d);
		d.setNext(e);
		e.setNext(f);
		f.setNext(c);
		//track.display();
		Node current1=track.head.getNext();
		Node current2=track.head.getNext().getNext();
		
		
		while(current1!=current2)
		{
			current2=current2.getNext().getNext();
			current1=current1.getNext();
		}
		//System.out.println(current2.getData());
		
		current1=track.head;
		while(current1!=current2)
		{
			current2=current2.getNext();
			current1=current1.getNext();
		}
		System.out.println("The circular linked list starts at node: "+current1.getData());
		

	}

}
