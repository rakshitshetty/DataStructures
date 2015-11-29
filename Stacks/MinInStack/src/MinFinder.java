
public class MinFinder 
{

	public static void main(String[] args) 
	{
		MyStack raks=new MyStack(10);
		
		raks.push(15);
		raks.push(16);
		raks.push(11);
		raks.push(9);
		raks.min();
		raks.peak();
		raks.pop();
		raks.min();
		raks.pop();
		raks.min();
		
	}

}
