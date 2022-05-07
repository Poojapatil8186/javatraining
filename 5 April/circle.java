////writr a programe to take radius input from user and calculate area circle
import java.util.*;
class circle
{
public static void main( String args[])
{
float a,r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius of circle");
r=sc.nextInt();
a=3.14f*r*r;
System.out.println("Area of circle is = "+a);
}
}
