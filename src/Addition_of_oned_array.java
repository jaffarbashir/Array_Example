public class Addition_of_oned_array
{
		public static void main(String [] args)
		{
			int[] a = new int[] {1, 2, 3, 4 ,5};
			int[] b = new int[] {6,5,4,3,2};
			int[] c = new int[5];
			for(int i = 0; i<a.length; i++)
			{
					c[i] = a[i] + b[i];
					System.out.print(c[i] +" ");
				
			}
		}
}
