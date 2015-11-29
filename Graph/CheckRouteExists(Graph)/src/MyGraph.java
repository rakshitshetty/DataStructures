import java.util.LinkedList;
import java.util.Queue;



public class MyGraph 
{
	Node[] vertices;
	int vertexcount;
	
	MyGraph(int n)
	{
		vertices=new Node[n];
		vertexcount=0;
	}
	
	public void addNode(Node a)
	{
		if(vertexcount<vertices.length)
		{
			vertices[vertexcount]=a;
			vertexcount++;
		}
		else
		{
			System.out.println("");
		}
	}
	
	public Node[] getNodes()
	{
		return vertices;
	}
	
	public void dfs(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.getVertex()+"\t");
		root.state=State.visited;
		
		for(Node u:root.getChild())
		{
			if(u.state==State.unvisited)
			{
				dfs(u);
			}
		}
	}
	
	public void checkRouteDFS(Node src,Node dest)
	{
		
		if(src==null)
		{
			return;
		}
		
		if(src==dest)
		{
			System.out.println("they are connected");
		}
		src.state=State.visited;
		
		for(Node u:src.getChild())
		{
			if(u.state==State.unvisited)
			{
				checkRouteDFS(u,dest);
			}
		}
		
		
	}
	
	public void checkRouteBFS(Node src,Node dest)
	{
		Queue<Node> queue=new LinkedList<Node>();
		if(src==null)
		{
			return;
		}
		
		
		src.state=State.visited;
		queue.add(src);
		while(!queue.isEmpty())
		{
			Node u=queue.remove();
			if(u==dest)
			{
				System.out.println("they are connected");
			}
			for(Node v:u.getChild())
			{
				if(v.state==State.unvisited)
				{
					queue.add(v);
					v.state=State.visited;
				}
			}
		}
	}
	
	
}
