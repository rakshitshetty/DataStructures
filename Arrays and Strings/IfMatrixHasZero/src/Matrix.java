
public class Matrix 
{

	public static void main(String[] args) 
	{
		int[][] matrix=new int[4][4];
		int length=(matrix.length);
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				matrix[i][j]=1;
			}
		}
		display(matrix);
		
		matrix[2][2]=0;
		//matrix[2][1]=0;
		System.out.println();
		display(matrix);
		System.out.println();
		
		int[] row=new int[length];
		int[] col=new int[length];
		
		
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(matrix[i][j]==0)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				if(row[i]==1||col[j]==1)
				{
					matrix[i][j]=0;
				}
			}
		}
		
		
		display(matrix);

	}

	
	public static void display(int[][] matrix)
	{
		int length=(matrix.length);
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}

}
