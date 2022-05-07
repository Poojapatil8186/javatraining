import java.util.*;
class radian
{
public static void main (String args[])
{
float degree;
double rad;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value" );
degree=sc.nextFloat();
rad=(degree*Math.PI)/180;
System.out.println(rad);
}
} 