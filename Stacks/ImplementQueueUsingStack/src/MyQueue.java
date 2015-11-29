import java.util.Stack;


public class MyQueue 
{
	Stack<Integer> stack1;
	Stack<Integer> stack2;
	
	MyQueue()
	{
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
	}
	
	public void addQueue(int item)
	{
		if(!stack1.isEmpty())
		{
			stack1.push(item);
		}
		else
		{
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			stack1.push(item);
		}
	}
	
	public int deleteQueue()
	{
		if(!stack1.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
			int top=stack2.pop();
			return top;
			
		}
		else
		{
			int top=stack2.pop();
			return top;
		}
	}
	
	public void display()
	
	{
		System.out.println("stack1: " +stack1.toString());
		System.out.println("stack2: " +stack2.toString());
	}
}
