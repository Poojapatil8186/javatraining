//WAP TO MATRIX MULTIPLICATION
import java.util.*;
class matrixmultiplication
{
public static void main ( String[] args )
{
int i,j,sum;
int[][]arr={{1,5,6},{6, 8, 9},{ 8,6,7}};
//int[][]brr={{1,3,4},{2,4,3},{1,2,4}};  
//int[][]sum=new int[3][3];   
for(i=0;i<3;i=i+1)//ROW INDEX
{
for(j=0;j<3;j=j+1)// COL INDEX
{
sum= arr[i][j]*arr[i][j];
System.out.print(sum+" ");
}
System.out.println();
}
}
}