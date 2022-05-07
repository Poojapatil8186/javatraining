//write a program to input angles of triangle and chech whether triangle is valid or not.

import java.util.*;
class Triangle
{
public static void main(String[] args)
{
int s1,s2,s3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a side ");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
if((s1 + s2 > s3)&&(s2 + s3 > s1)  && (s3 + s1 > s2))
{  
System.out.println("It is a Valid Triangle");  
}
else 
{  
System.out.println("It is an invalid Triangle");  
}  
}
}