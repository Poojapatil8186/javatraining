//1)Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.
//Enter Start:
//5
//Enter End:
//9
//5
//6
//7
//8
//9
//2)Modify your program so that it calculates the sum both ways:
//Enter N:
//10
//Loop Sum = 55
//Formula Sum = 55
//You might worry that the formula will lead to integer division problems. But it works as is. Why? (Hint: think about even and odd.)
//The sum of sequential integers 1 to N is called a triangle number. See the exercises for chapter 25.
import java.util.*;
class whilestartandend
{
public static void main(String[] args)
{
int a,b;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter start number  ");
a=sc.nextInt();
System.out.println("Enter end number ");
b=sc.nextInt();
while(a<=b)
{
System.out.println(a);
a=a+1;
}
}
}
