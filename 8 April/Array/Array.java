//5.Write a Java program to sort values of  array elements. 
import java.util.*;
class Array {    
    public static void main(String[] args) { 
    int i,temp=0;       
            int arr[]=new int[5];
System.out.println("Enter 5 array element  ");
Scanner sc=new Scanner(System.in);
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
for ( i = 0; i < arr.length; i++)
 {     
 for (int j = i+1; j < arr.length; j++) 
 {     
if(arr[i] > arr[j])
 {    
 temp = arr[i];    
 arr[i] = arr[j];    
 arr[j] = temp;    
  }     
 }     
}    
          
System.out.println();    
System.out.println("Elements of array sorted in ascending order: ");    
 for ( i = 0; i < arr.length; i++)
  {     
   System.out.print(arr[i] + " ");    
}    
   
 }    
}    