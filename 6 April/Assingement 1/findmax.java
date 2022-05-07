//write a program to find maximum betwwen three numbers. 
import java.util.*;
class findmax
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("maxium number is :"+a);
}
else if(b>a && b>c)
{
System.out.println("maxium number is :"+b);
}
else if(c>b && c>a)
{
System.out.println("maxium number is :"+b);
}
else
{
System.out.println("given three number are not distict");
}
}
}

