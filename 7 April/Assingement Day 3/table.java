//Write program to print multiplication table of a given number
import java.util.*;
class table
{
public static void main(String[] args)
{
int n,i=1;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter a number  ");
n=sc.nextInt();
while(i<=10)
{

 System.out.println(n+" * "+i+" = "+n*i);
i++;
}
}
}



