//2. Write a program   to read n number of values in an array and display it in reverse order. 
//Test Data : 
//Input the number of elements to store in the array :3 
//Input 3 number of elements in the array : 
//element - 0 : 2 
//element - 1 : 5 
//element - 2 : 7 
//Expected Output : 
//The values store into the array are : 
//2 5 7 
//The values store into the array in reverse are : 
//7 5 2 
import java.util.*;
class reverse
{
public static void main(String[] args)
{
int i;
//Scanner  sc= new Scanner(System.in);
//System.out.println("Elements of given array :");
int []arr= {2,5,7};
for(i=0;i<=arr.length;i=i+1) 
{
}
for(i=arr.length-1 ; i>=0; i=i-1) 
{
System.out.println(arr[i] );
}
} 
}