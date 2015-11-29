
public class Implement 
{

	public static void main(String[] args) 
	{
		int[] array={1,2,3,4,5,6,7,8,9,10};
		MinHtTree tree=new MinHtTree(array);
		Node a=tree.returnNode();
		System.out.println(a.toString());
		

	}

}
