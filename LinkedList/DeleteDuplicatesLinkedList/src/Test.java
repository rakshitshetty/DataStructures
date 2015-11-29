
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyLinkedList rak=new MyLinkedList();
		rak.add("b");
		rak.add("b");
		rak.add("b");
		rak.add("a");
		rak.add("a");
		rak.add("a");
		rak.add("f");
		rak.add("a");
		rak.add("b");
		rak.add("c");
		rak.add("d");
		rak.add("b");
		rak.add("c");
		
		rak.display();
		rak.deleteDuplicates();
		rak.display();
	}

}
