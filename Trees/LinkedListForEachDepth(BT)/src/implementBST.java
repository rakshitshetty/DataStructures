import java.util.ArrayList;
import java.util.LinkedList;



public class implementBST 
{
	public static void main(String[] args)
	{
		BST rak=new BST();
		
		rak.addNode(50, "1");
		rak.addNode(25, "2");
		rak.addNode(15, "3");
		rak.addNode(30, "4");
		rak.addNode(75, "5");
		rak.addNode(85, "6");
		
		//rak.preorderTraversal(rak.root);
		ArrayList<LinkedList> solution=rak.getLevelLinkedList(rak.root);
		System.out.println(solution.toString());
	}
}
