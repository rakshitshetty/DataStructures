
public class NewMain 
{
	public static void main(String[] args)
	{
	
		MyLinkedList rak=new MyLinkedList();
		rak.addNode("a");
		rak.addNode("b");
		rak.addNode("c");
		rak.addNode("d");
		rak.addNode("e");
		rak.display();
		rak.deleteNode("d");
		rak.display();
		
		rak.reverseList();
	}
}
