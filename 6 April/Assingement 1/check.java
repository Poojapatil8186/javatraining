//write a program to check whethere a number is negative or positive or zero.
import java.util.*;
class check
{
public static void main(String args[])
{
float num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextFloat();
if(num > 0)
{
System.out.println("Positive number");
}
else
{
 if(num == 0)
 {
   System.out.println("Zero");
   }
else
{
System.out.println("Negative number");
}
}
}
}
