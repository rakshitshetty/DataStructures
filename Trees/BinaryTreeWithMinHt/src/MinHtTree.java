
public class MinHtTree 
{
	int[] array;
	Node n;
	MinHtTree(int[] array)
	{
		
		this.array=array;

	}
	
	public Node returnNode()
	{
		return createTree(this.array,0,this.array.length-1);
	}
	
	public Node createTree(int[] array,int left,int right)
	{
		if(right<left)
		{
			return null;
		}
		int mid=(left+right)/2;
		Node n=new Node(array[mid],array[mid]);
		n.leftchild=createTree(array,left,mid-1);
		n.rightchild=createTree(array,mid+1,right);
		return n;
	}
}
