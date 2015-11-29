
public class Check 
{

	public static void main(String[] args) 
	{
		String a="waterbotte";
		String b="aterbottlew";
		checkSubstring(a,b);
		

	}
	
	public static void checkSubstring(String a,String b)
	{
		String st=new String();
		for(int i=0;i<2*a.length();i++)
		{
			st=st+a.charAt(i%a.length());
		}
		if(st.contains(b))
		{
			System.out.println("it is a substring");
		}
		else
		{
			System.out.println("it is not a substring");
		}
	}

}
