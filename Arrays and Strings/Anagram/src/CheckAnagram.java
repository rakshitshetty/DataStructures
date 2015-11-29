import java.util.Collections;


public class CheckAnagram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a="rakshith";
		String b="htihskr";
		
		System.out.println(check(a,b));
		

	}
	
	public static boolean check(String s,String t)
	{
		boolean anagram=false;
		
		int[] letters=new int[256];
		int num_unique=0;
		int num_completed=0;
		char[] s_array=s.toCharArray();
		
		for(char c:s_array)
		{
			if(letters[c]==0)
			{
				num_unique++;
				
			}
			letters[c]++;
		}
			
		for(int i=0;i<t.length();i++)
		{
			int c=(int)t.charAt(i);
			if(letters[c]==0)
			{
				anagram=false;
			}
			
			letters[c]--;
			if(letters[c]==0)
			{
				num_completed++;
				if(num_completed==num_unique)
				{
					return i==t.length()-1;
				}
			}
		}
		
		return anagram;
	}

}
