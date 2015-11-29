import java.util.ArrayList;


public class SetOfStacks 
{
	ArrayList<MyStack> al=new ArrayList<MyStack>();
	
	public MyStack getLastStack()
	{
		if(al.size()==0)
		{
			return null;
		}
		else
		{
			return al.get(al.size()-1);
		}
	}
	
	
	
	public void push(int item)
	{
		MyStack last=getLastStack();
		if(last!=null && last.size<5)
		{
			last.push(item);
		}
		else
		{
			MyStack stack=new MyStack();
			stack.push(item);
			al.add(stack);
		}
	}
	
	public int pop()
	{
		MyStack last=getLastStack();
		int v=last.pop();
		if(last.size==0)
		{
			al.remove(al.size()-1);
		}
		return v;
	}
	
}
