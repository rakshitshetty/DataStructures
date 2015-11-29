
public class myQueue 
{
	int front,rear;
	int[] store;
	
	myQueue(int size)
	{
		front=0;
		rear=0;
		store=new int[size];
	}
	
	public void enqueue(int item)
	{
		
		store[rear]=item;
		rear++;
	}
	
	public void dequeue()
	{
		System.out.println("first item in list "+store[front]);
		front++;
	}
	
	public void search(int item)
	{
		for(int i=0;i<store.length;i++)
		{
			if (store[i]==item)
			{
				System.out.println("found");
			}
			else
			{
				System.out.println("not found");
			}
		}
	}
	
	public void showall()
	{
		for(int i=front;i<=rear-1;i++)
		{
			System.out.println(store[i]);
		}
	}
	
}
