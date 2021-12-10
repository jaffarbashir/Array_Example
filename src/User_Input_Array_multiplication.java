import java.util.*;
public class User_Input_Array_multiplication 
{
	public static void main(String [] args)
	{	int[][] array1;
		int[][] array2;
		int[][] multiplication;
		int rows1, columns1,rows2, columns2, i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows of first matrix: ");
		rows1 = sc.nextInt();
		System.out.print("Enter the number of columns of first matrix: ");
		columns1 = sc.nextInt();
		array1 = new int[rows1][columns1];
		System.out.print("Enter the number of rows of second matrix: ");
		rows2 = sc.nextInt();
		System.out.print("Enter the number of columns of second matrix: ");
		columns2 = sc.nextInt();
		array2 = new int[rows2][columns2];
		multiplication = new int[rows1][columns2];
		if(columns1==rows2)
			{
				System.out.print("Enter the elements of first matrix: ");
				for(i = 0; i<rows1; i++)
				{
					for(j = 0; j<columns1; j++)
					{
						array1[i][j] = sc.nextInt();
					}
				}
				System.out.println("Elements of first matrix are: ");
				for(i= 0; i<rows1; i++)
				{
					for(j = 0; j<columns1; j++)
					{
						System.out.print(array1[i][j] +" ");
					}
					System.out.println();
				}
				System.out.print("Enter the elements of Second matrix: ");
				for(i = 0; i<rows2; i++)
				{
					for(j = 0; j<columns2; j++)
					{
						array2[i][j] = sc.nextInt();
					}
				}
				System.out.println("Elements of Second matrix are: ");
				for(i= 0; i<rows1; i++)
				{
					for(j = 0; j<columns1; j++)
					{
						System.out.print(array2[i][j] + " ");
					}
					System.out.println();
				}
				for(i = 0; i<rows1; i++)
				{
					for(j = 0; j<columns2; j++)
					{
						for(int k= 0; k<multiplication.length; k++)
						{
							multiplication[i][j] += array1[i][k]*array2[k][j]; 
						}
						System.out.print(multiplication[i][j]+ " ");
					}
					System.out.println();
				}
			}
		else
		{
			System.out.println("Multiplication is not possible");
		}
		
		
	}
}
