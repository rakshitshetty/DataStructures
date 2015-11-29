
public class Replace 
{
	public static void main (String[] args)
	{
		char[] a=new char[20];
		a[0]='h';
		a[1]='i';
		a[2]=' ';
		a[3]='m';
		a[4]='y';
		a[5]=' ';
		a[6]='n';
		a[7]='a';
		a[8]='m';
		a[9]='e';
		a[10]=' ';
		replace(a);
		System.out.println(a);
	}
	
	public static void replace(char[] a)
	{
		
		int spacecount=0;
		int checklength=0;
		//System.out.println(length);
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='\0')
			{
				break;
			}
			checklength++;
		}
		System.out.println("checklength="+checklength);		
		
		for(int i=0;i<checklength;i++)
		{
			if(a[i]==' ')
			{
				spacecount++;
			}
		}

		
		System.out.println(spacecount);
		
		int newlength=checklength+(spacecount*2);
		System.out.println(newlength);
		//a[newlength]='\0';
		
		for(int i=checklength-1;i>=0;i--)
		{
			if(a[i]==' ')
			{
				a[newlength-1]='0';
				a[newlength-2]='2';
				a[newlength-3]='%';
				newlength=newlength-3;
			}
			else
			{
				a[newlength-1]=a[i];
				newlength=newlength-1;
			}
		}
		
		
	}
}
