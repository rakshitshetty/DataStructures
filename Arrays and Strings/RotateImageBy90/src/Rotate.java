
public class Rotate 
{
	public static void main(String[] args)
	{
		int[][] matrix=new int[5][5];
		matrix[1][0]=1;
		matrix[1][1]=1;
		matrix[1][2]=1;
		matrix[1][3]=1;
		matrix[1][4]=1;
		matrix[2][1]=1;
		matrix[2][2]=1;
		matrix[2][3]=1;
		matrix[3][2]=1;
		
		System.out.println("before rotation");
		display(matrix);
		rotate(matrix);
		System.out.println("after rotation");
		display(matrix);
		
		

	}
	public static void display(int[][] matrix)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] matrix)
	{
		int n=5;
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last=n-1-layer;
			
			for(int i=first;i<last;i++)
			{
				int offset=i-first;
				
				int top=matrix[first][i];
				
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last-offset]=matrix[i][last];
				matrix[i][last]=top;
			}
		}
	}
	
	public static void swap(int i,int j,int m ,int n,int[][] matrix)
	{
		int temp;
		temp=matrix[i][j];
		matrix[i][j]=matrix[m][n];
		matrix[m][n]=temp;
	}
}
