
public class MyStack 
{
	int stacksize=300;
	int[] top={0,100,200};
	int[] greater={99,199,299};
	int[] lesser={0,100,200};
	
	int[] array=new int[stacksize*3];
	
	
	public void push(int stackNo,int data)
	{
		if(top[stackNo]>greater[stackNo])
		{
			System.out.println("overflow");
		}
		else
		{
			
			array[top[stackNo]]=data;
			top[stackNo]++;
		}
	}
	
	public void pop(int stackNo)
	{
		if(top[stackNo]<lesser[stackNo])
		{
			System.out.println("underflow");
			
		}
		else
		{
			
			top[stackNo]--;
			System.out.println("the popped element is"+array[top[stackNo]]);
		}
	}
	
	public void peak(int stackNo)
	{
		System.out.println(array[top[stackNo]-1]);
	}
	
	public void display()
	{
		System.out.println("STACK 1");
		for(int i=lesser[0];i<top[0];i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("STACK 2");
		for(int i=lesser[1];i<top[1];i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("STACK 3");
		for(int i=lesser[2];i<top[2];i++)
		{
			System.out.println(array[i]);
		}
	}
	
}
