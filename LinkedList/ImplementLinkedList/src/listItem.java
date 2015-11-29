
public class listItem 
{

	String data;
	listItem next;
	
	listItem(String data)
	{
		this.data=data;
		this.next=null;
	}
	
	listItem(String data,listItem next)
	{
		this.data=data;
		this.next=next;
	}
	
	public void setData(String data)
	{
		this.data=data;
	}
	
	public String getData()
	{
		return data;
	}
	
	public void setNext(listItem next)
	{
		this.next=next;
	}
	
	public listItem getNext()
	{
		return next;
	}	
	
}
