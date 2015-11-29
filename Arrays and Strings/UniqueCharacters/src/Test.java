import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your sentence");
		String line=input.nextLine();
		if(isUnique(line))
		{
			System.out.println("has unique characters");
		}
		else
		{
			System.out.println("Sentence doesnt have unique characters");
		}
		input.close();

	}
	public static boolean isUnique(String line)
	{
		int checker=0;
		
		for(int i=0;i<line.length();i++)
		{
			int value=line.charAt(i)-'a';
			value=1<<value;
			
			if(((value)&checker)>0)
			{
				return false;
			}
			
			checker=checker|value;
		}
		return true;
	}

}
