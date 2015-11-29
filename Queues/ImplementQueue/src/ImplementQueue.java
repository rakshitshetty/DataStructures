
public class ImplementQueue 
{

	public static void main(String[] args) 
	{
		myQueue rak=new myQueue(3);
		
		rak.enqueue(1);
		rak.enqueue(2);
		rak.enqueue(3);
		rak.showall();
		rak.dequeue();
		rak.showall();
	}

}
