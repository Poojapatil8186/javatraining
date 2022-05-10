import java.util.*;
class DemoArray2
{
public static void main(String[] args)
{
int i,item;
Scanner  sc= new Scanner(System.in);
// Declare int array iof size 5
int[] arr={2,3,7,9,1,4,6,3,2};
boolean isfound=false; 
System.out.println("Enter item to search ");
for(i=0;i<arr.length;i=i+1)
{
isfound=true;
break;
}
if (isfound==true)
{
System.out.println(" item found");
}
else
{
System.out.println(" item not found");
}
}
}