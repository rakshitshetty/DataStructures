
public class Node 
{
	private String vertex;
	Node[] child;
	int childcount;
	public State state;
	
	Node(String vertex)
	{
		this.vertex=vertex;
	}
	
	Node(String vertex,int children)
	{
		childcount=0;
		this.vertex=vertex;
		child=new Node[children];
	}
	
	public void addChildNode(Node adj)
	{
		adj.state=State.unvisited;
		if(childcount<child.length)
		{
			child[childcount]=adj;
			childcount++;
		}
		else
		{
			System.out.println(this.vertex+"already has max no of children");
		}
		
	}
	
	public Node[] getChild()
	{
		return child;
	}
	
	public String getVertex()
	{
		return this.vertex;
	}
}
