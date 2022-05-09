//Write program to calculate power of number (a raise to b) using while & for loop
import java.util.*;
class power
{
public static void main(String[] args) 
{
int base, exponent;
double result=1;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter a base ");
base=sc.nextInt();
System.out.println("Enter a exponent ");
exponent=sc.nextInt();
while (exponent != 0) 
{
result *= base;
exponent=exponent-1;
}
System.out.println("Answer = " + result);
  }
}