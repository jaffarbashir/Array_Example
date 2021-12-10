
public class Array_Multiplication
{
	public static void main(String [] args)
	{
  int[][] array1 = new int[][] {{1,2,3},{4,5,6},{2,3,4}};
  int[][] array2 = new int[][] {{1,2,3},{4,3,2},{3,3,2}};
  int[][] multiplication = new int[3][3];
  for(int i = 0; i<array1.length; i++)
  {
	  for(int j = 0; j<array2.length; j++)
	  {
		 multiplication[i][j] = 0;
		 for(int k = 0;k<3;k++ )
		 {
			multiplication[i][j] += array1[i][k]*array2[k][j]; 
		 }
		 System.out.print(multiplication[i][j] +" ");
	  }
	  System.out.println();
  }
}
}
