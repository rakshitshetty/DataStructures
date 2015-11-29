
public class Test {

	public static void main(String[] args) 
	{
		MyLinkedList rak=new MyLinkedList();
		
		rak.add("1");
		rak.add("2");
		rak.add("3");
		rak.add("4");
		
		rak.display();
		
		Node node=new Node("4");
		rak.removeNode(node);
		
	}

}
