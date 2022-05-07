//7. Write program to print Fibonacci series
import.java.util.*
class Fibonacci
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=0,b=1,c,i=3,n;'
System.out.println("Enter the Number : ");
n=sc.nextInt();
System.out.println(a+" "+b);
while(i<=n)
{
c=a+b;
System.out.println(" "+c);
a=b;
b=c;
i=i+1;
}
}
}