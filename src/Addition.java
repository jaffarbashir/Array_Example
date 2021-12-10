public class Addition
{  
public static void main(String [] args)
{     
int[][] array1={{1,3,4},{2,4,3},{3,4,5}};    
int[][] array2={{1,3,4},{2,4,3},{1,2,4}};        
int[][] sum=new int[3][3];  
    
    
for(int i=0;i<array1.length;i++)
{    
for(int j=0;j<array2.length;j++)
{    
sum[i][j]=array1[i][j]+array2[i][j];
System.out.print(sum[i][j]+" ");    
}    
System.out.println();
}    
}
}  