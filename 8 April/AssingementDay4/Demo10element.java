//1. Write a program   to store elements in an array and print it. 
//Test Data : 
//Input 10 elements in the array : 
//element - 0 : 1 
//element - 1 : 1 
//element - 2 : 2 
//....... 
//Expected Output : 
//Elements in array are: 1 1 2 3 4 5 6 7 8 9 
import java.util.*;
class Demo10element
{
public static void main(String[] args)
{
int i=0;
//Scanner  sc= new Scanner(System.in);
//System.out.println("Elements of given array :");
//arr[i]=sc.nextInt();
//int arr[]=new int[10]; 
int [] arr= { 1, 1, 2, 3, 4, 5, 6, 7, 8, 9 };  

for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i] + " ");
}
}
}