import java.lang.reflect.Array;
import java.util.*;
public class Addition_Of_Two_Matrices
{
	public static void main(String [] args)
	{
		int rows1, columns1, rows2, columns2, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows of first matrix: ");
		rows1 = sc.nextInt();
		System.out.print("Enter the number of columns of first matrix:  ");
		columns1 = sc.nextInt();
		int[][] array1 = new int[rows1][columns1];
		System.out.print("Enter the number of rows of 2nd matrix: ");
		rows2 = sc.nextInt();
		System.out.print("Enter the number of columns of 2nd matrix:  ");
		columns2 = sc.nextInt();
		int[][] array2 = new int[rows2][columns2];
		int[][] sum_array = new int[rows1][columns1];
		if(array1.length == array2.length)
		{
			System.out.println("Enter the elements of first matrix: ");
			for(i = 0; i<rows1; i++ )
			{
				for(j = 0; j<columns1; j++)
				{
					array1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Elements of first matrix are: ");
			for(i =0;i<rows1;i++)
			{
				for(j=0;j<columns1; j++)
				{
					System.out.print(array1[i][j] +" ");
				}
				System.out.println();
			}
			System.out.println("Enter the elements of 2nd matrix: ");
			for(i = 0; i<rows1; i++ )
			{
				for(j = 0; j<columns1; j++)
				{
					array2[i][j] = sc.nextInt();
				}
			}
			System.out.println("Elements of second matrix are: ");
			for(i =0;i<rows1;i++)
			{
				for(j=0;j<columns1; j++)
				{
					System.out.print(array2[i][j] +" ");
				}
				System.out.println();
			}
			System.out.println("Addition is: ");
			for(i = 0; i<array1.length;i++)
			{
				for(j =0;j<array2.length;j++)
				{
					sum_array[i][j] = array1[i][j] + array2[i][j];
					System.out.print(sum_array[i][j] + " ");
				}
				System.out.println();
			}
			
		}
		
		
	}
}
