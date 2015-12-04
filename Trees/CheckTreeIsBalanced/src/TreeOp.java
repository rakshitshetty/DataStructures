


public class TreeOp {

	public static void main(String[] args) 
	{
		bst rak=new bst();
		rak.addNode(50, "h");
		rak.addNode(25, "d");
		rak.addNode(75, "l");
		rak.addNode(15, "b");
		rak.addNode(35, "f");
		rak.addNode(65, "g");
		rak.addNode(85, "n");
		rak.addNode(5, "a");
		rak.addNode(20, "c");
		rak.addNode(30, "e");
		rak.addNode(40, "g");
		rak.addNode(55, "i");
		rak.addNode(70, "k");
		rak.addNode(80, "m");
		rak.addNode(90, "o");
		System.out.println(rak.checkIfBalanced());

	}

}
