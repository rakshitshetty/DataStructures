
public class Test 
{
	public static void main(String[] args)
	{
		MyLinkedList list1=new MyLinkedList();
		list1.add(3);
		list1.add(1);
		list1.add(5);
		
		MyLinkedList list2=new MyLinkedList();
		list2.add(5);
		list2.add(9);
		list2.add(2);
		
		list1.add(list2);
	}
	
	
}
