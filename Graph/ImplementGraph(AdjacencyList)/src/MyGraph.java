

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
	
	
}
