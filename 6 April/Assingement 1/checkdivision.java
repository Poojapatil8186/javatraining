//write a program to check whethere a number is divisiable by 5 and 11 or not.

import java.util.*;

class checkdivision
{
public static void main(String[] args)
{
float n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextFloat();
if(n % 5 == 0)
{
System.out.println("Yes ");
}
else
{
System.out.println("No ");
}
}
}
