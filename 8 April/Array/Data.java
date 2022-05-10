//3. Write a program   to find the sum of all elements of the array. 
//Test Data : 
//Input the number of elements to be stored in the array :3 
//Input 3 elements in the array : 
//element - 0 : 2 
//element - 1 : 5 
//element - 2 : 8 
//Expected Output : 
//Sum of all elements stored in the array is : 15
import java.util.*;
class Data
{
public static void main(String[] args)
{
int [] arr = {12,3,4,15};
int sum ,i;
arr[i]=sc.nextInt();
for (i = 0; i < arr.length; i++)
{
sum += arr[i];
}
System.out.println("Sum of given array is " + sum);
}
}
