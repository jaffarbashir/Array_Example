
public class Array_decleration 
{
	public static void main(String [] args)
	{
		int[] arr = new int[4];
		arr[1] = 10;
		arr[2] = 20;
		arr[0] = 1;
		arr[3] = 2;
		int[] arra = new int[]{1,2,3,4,5};
		for(int i = 0; i<arr.length; i++)
		{
		System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arra.length; i++)
		{
			System.out.print(arra[i]);
		}
			
	}
}
