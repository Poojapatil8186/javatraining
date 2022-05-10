import java.util.*;
class DemoArray
{
public static void main(String[] args)
{
int i;
Scanner  sc= new Scanner(System.in);
// Declare int array iof size 5
int arr[]=new int[5]; 
System.out.println("Enter array  ");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("Your array");
for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);
}
}
}