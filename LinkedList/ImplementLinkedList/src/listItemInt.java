
public class listItemInt
{
	int data;
	listItemInt next;
	
	listItemInt(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	listItemInt(int data,listItemInt next)
	{
		this.data=data;
		this.next=next;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setNext(listItemInt next)
	{
		this.next=next;
	}
	
	public listItemInt getNext()
	{
		return next;
	}	
}
