
public class ImplementGraph 
{
	public static void main(String[] args)
	{
        MyGraph g = new MyGraph(8);        
        Node[] node = new Node[8];

        node[0] = new Node("A", 3);
        node[1] = new Node("B", 3);
        node[2] = new Node("C", 1);
        node[3] = new Node("D", 1);
        node[4] = new Node("E", 1);
        node[5] = new Node("F", 1);
        node[6] = new Node("G",1);

        node[0].addChildNode(node[1]);
        node[0].addChildNode(node[2]);
        node[0].addChildNode(node[3]);

        node[1].addChildNode(node[0]);
        node[1].addChildNode(node[4]);
        node[1].addChildNode(node[5]);

        node[2].addChildNode(node[0]);
        node[3].addChildNode(node[0]);
        node[4].addChildNode(node[1]);
        node[5].addChildNode(node[1]);
        node[6].addChildNode(node[5]);

        for (int i = 0; i < 7; i++) 
        {
            g.addNode(node[i]);
        }
        System.out.println("here");
        g.checkRouteBFS(node[0],node[4]);
        
	}
}
