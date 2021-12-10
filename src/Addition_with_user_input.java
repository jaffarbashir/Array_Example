import java.util.*;
public class Addition_with_user_input
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of an array: ");
		n = sc.nextInt();
		int[] array1 = new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0; i<n; i++)
		{
			array1[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++)
		{
		System.out.print(array1[i] +" ");
		
	}
}}
