import java.lang.reflect.Array;

public class Multiplication_of_oned_arrays 
{
public static void main(String [] args)
{
	int[] array1 = new int[] {1,2,3,4,5};
	int[] array2 = new int[] {5,4,3,2,1};
	int[] multiplication = new int[5];
	for(int i = 0; i<array1.length; i++)
	{
		multiplication[i] = array1[i] * array2[i];
		System.out.print(multiplication[i] +" ");
	}
}
}
