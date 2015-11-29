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
	
	public void bfs(Node root)
	{
		Queue<Node> queue=new LinkedList<Node>();
		
		if(root==null)
		{
			return;
		}
		
		
		root.state=State.visited;
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node r=queue.remove();
			System.out.print(r.getVertex()+"\t");
			
			for(Node n:r.getChild())
			{
				if(n.state==State.unvisited)
				{
					queue.add(n);
					n.state=State.visited;
				}
			}
		}
	}
}
