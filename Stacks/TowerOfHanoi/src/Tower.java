import java.util.Stack;


public class Tower 
{
	private Stack<Integer> disks;
	private int index;
	
	Tower(int i)
	{
		disks=new Stack<Integer>();
		index=i;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public void add(int d)
	{
		if(!disks.isEmpty() && disks.peek()<=d)
		{
			System.out.println("error placing disk " +d);
		}
		else
		{
			disks.push(d);
		}
	}
	
	public void moveTopTo(Tower t)
	{
		int top=disks.pop();
		t.add(top);
		System.out.println("moved disk "+top+ " from tower "+getIndex()+" to tower "+t.getIndex());
	}
	
	public void print()
	{
		System.out.println("contents of tower "+getIndex());
		for(int i=disks.size()-1;i>=0;i--)
		{
			System.out.println(" "+disks.get(i));
		}
	}
	
	public void moveDisks(int n ,Tower destination,Tower buffer)
	{
		if(n>0)
		{
			moveDisks(n-1,buffer,destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
			
		}
	}
}
