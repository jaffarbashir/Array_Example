
public class Anonumous_array 
{
public static void main(String [] args)
{
	Anonumous_array.Sum(new int[] {1,2,3,4,5});
}
static void Sum(int[] no)
{
	int total = 0;
	for(int i:no)
	{
		total += i;
	}
System.out.println(total);}
}
