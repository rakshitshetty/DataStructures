
public class Use 
{

	public static void main(String[] args) 
	{
		
		MyQueue raks=new MyQueue();
		raks.addQueue(10);
		raks.addQueue(20);
		raks.addQueue(30);
		raks.addQueue(40);
		raks.display();
		raks.deleteQueue();
		raks.display();
		raks.deleteQueue();
		raks.display();
		raks.addQueue(70);
		raks.display();
	}

}
