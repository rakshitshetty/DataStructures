package implementGraph;

public class implementGraph 
{

	public static void main(String[] args) 
	{
		Mygraph rak=new Mygraph(5);
		
		rak.addNode("a");
		rak.addNode("b");
		rak.addNode("c");
		rak.addNode("d");
		
		rak.addEdge("a", "e");
		rak.checkconnected("a", "e");

	}

}
