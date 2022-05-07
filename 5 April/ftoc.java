//writr a programe to convert temperature fahreheit celsisus 
import java.util.*;
class ftoc
{
public static void main( String args[])
{
int f,c;
Scanner sc=new Scanner(System.in);
System.out.print("Enter temperature in  fahrenheit =");
f=sc.nextInt();
c=(f-32)*5/9;
System.out.print("Temperature in celsius is "+c);
}
}


