//Write program to check a enter number is Prime number or not using while & for loop
import java.util.*;
class primeornot
{
public static void main(String[] args)
{
int n,i=2;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter a number  ");
n=sc.nextInt();
while(i <= n/ 2)
{
if(n % i == 0) 
{
System.out.println("This is not a prime Number");
}
else
{
System.out.println("This is a prime Number");
}
i=i+1;
}
}
}
