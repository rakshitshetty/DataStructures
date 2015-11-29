import java.util.Stack;


public class Use 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(70);
		stack.push(60);
		stack.push(50);
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(10);
		System.out.println(stack.toString());
		System.out.println("sorted");
		sort(stack);
	}
	public static void sort(Stack<Integer> stack)
	{
		Stack<Integer> temp=new Stack<Integer>();
		int check;
		if(stack.isEmpty())
		{
			System.out.println("stack is empty nothing to sort");
		}
		else
		{
			while(!stack.isEmpty())
			{
				check=stack.pop();
				while(!temp.isEmpty()&&check<temp.peek())
				{
					stack.push(temp.pop());
				}
				temp.push(check);
			}
		}
	
		System.out.println(temp.toString());
	}
}
