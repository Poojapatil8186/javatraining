//Exercise 2 — Sum of Sequential Integers
//Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
//Enter N:10
//Sum = 55
//Do this in a loop that counts up 1 to N and in each iteration adds the current count to the sum.
//Another way to calculate the same thing is through a formula:
//sum = (n*(n+1))/2
import java.util.*;
class loopwhile
{
public static void main(String[] args)
{
int n,sum=0,i=0;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter a number ");
n=sc.nextInt();
while(i<=n)
{
sum = (n*(n+1))/2;
i=i+1;
}
System.out.println(sum);
}
}
