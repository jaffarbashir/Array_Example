import java.util.*;
public class User_twoD_array 
{
	public static void main(String [] args )
	{
	int i,j,m,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows: ");
	m = sc.nextInt();
	System.out.println("Enter the number of columns: ");
	n = sc.nextInt();
	int[][] array1 = new int[m][n];
	System.out.println("Enter the elements: ");
	for(i = 0; i<m;i++)
	{
		for(j = 0; j<n; j++)
		{
			array1[i][j] = sc.nextInt();
		}
	}
			System.out.println("Elemetns of the aray are: ");
			for(i = 0; i<m; i++)
			{
				for(j = 0; j<n; j++)
				{
					System.out.print(array1[i][j]+ " ");
				}
				System.out.println("");
			}

}
}
