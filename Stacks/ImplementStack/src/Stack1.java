


public class Stack1
{
	int top;
	int[] store;
		
	Stack1(int size)
	{
		store=new int[size];
		top=0;
	}
	 
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
	

	
	public void pop()
	{
		if((top)==0)
		{
			System.out.println("underflow:deletion not possible ");
		}
		else
		{
			System.out.println(store[top-1]); 
			top--;
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
