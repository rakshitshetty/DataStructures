
public class MyStack 
{
	int top;
	int size=5;
	int[] store=new int[size];
		
//	MyStack(int size)
//	{
//		store=new int[size];
//		top=0;
//	}
	 
	public void push(int item)
	{
		System.out.println("top: "+top);
		System.out.println("length: "+store.length);
		if((top)==store.length)
		{
			System.out.println("overflow additon not possible");
		}
		else
		{
			
			store[top]=item;
			top++;
		}
	}
	

	
	public int pop()
	{
		if((top)==0)
		{
			System.out.println("underflow:deletion not possible ");
			return 0;
		}
		else
		{
			top--;
			return store[top]; 
			
		}
		
	}
	
	public void peak()
	{
		System.out.println(store[top]);
	}
	
	public void search(int item)
	{
		int count=0;
		for(int i=0;i<store.length;i++)
		{
			if(store[i]==item)
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
	
}
