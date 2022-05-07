//write a programe meter to feet and inches 
// 1 meter=3.28084 feet
// 1 meter=39.37 inches  
import java.util.*;
class mtomtoi
{
public static void main( String args[])
{
float m,f,i;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value in meter");
m=sc.nextFloat();
f=m*3.28084f;
i=m*39.37f;
System.out.print(" Meter to feet is =" +f);
System.out.print(" Meter to Inches is =" +i);
}
}

