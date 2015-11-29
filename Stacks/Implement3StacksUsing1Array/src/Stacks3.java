
public class Stacks3 
{

	public static void main(String[] args) 
	{
		MyStack raks=new MyStack();
		
		raks.push(0,10);
		raks.push(0,20);
		raks.display();
		raks.pop(0);
		raks.display();
		raks.push(0,20);
		raks.push(0,30);
		raks.push(1,100);
		raks.push(1,200);
		raks.push(1,300);
		raks.push(2,1000);
		raks.push(2,2000);
		raks.push(2,3000);
		raks.display();

	}

}
