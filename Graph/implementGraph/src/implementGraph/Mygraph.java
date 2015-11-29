package implementGraph;

import java.util.HashMap;

public class Mygraph 
{
	HashMap<String,Integer> vertexlist=new HashMap<String,Integer>();
	int count=0;
	int source,destination;
	int[][] edgelist;
	
	Mygraph(int num)
	{
		edgelist=new int[num][num];
		
	}
	
	public void addNode(String data)
	{
		vertexlist.put( data,count);
		count++;
		System.out.println("count="+count);
	}
	
	public void addEdge(String source,String destination)
	{
		if(vertexlist.containsKey(source)  && vertexlist.containsKey(destination))
		{
			this.source=vertexlist.get(source);
			this.destination=vertexlist.get(destination);
			edgelist[this.source][this.destination]=1;
			System.out.println(edgelist[this.source][this.destination]);
		}
		else
		{
			System.out.println("nodes dont exist");
		}
	}
	
	public void checkconnected(String source,String destination)
	{
		if(vertexlist.containsKey(source)  && vertexlist.containsKey(destination))
		{
			if(edgelist[vertexlist.get(source)][vertexlist.get(source)]==1)
			{
				System.out.println(source +" and "+destination+" are connected");
			}
			else
			{
				System.out.println(source +" and "+destination+" are not  connected");
			}
		}
		else
		{
			System.out.println("nodes dont exist");
		}
	}
	
}
