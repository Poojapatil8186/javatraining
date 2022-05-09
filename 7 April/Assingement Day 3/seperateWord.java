/*Write a program that asks the user to enter two words. The program then prints out both words on one line. 
The words will be separated by enough dots so that the total line length is 30:
Enter first word:
turtle
Enter second word
153
turtle....................153
This could be used as part of an index for a book. To print out the dots, use System.out.print(".") inside a loop body.*/
import java.util.*;
class seperateWord 
{
public static void main (String [] args) 
{
String first, second, result;
int counting, periods, i=0,dots;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter : ");
first = sc.next();
System.out.println("Please enter word #2: ");
second = sc.next();
result = first + "" + second;
counting = result.length();
periods = 0;
if(counting<=30)
{
periods = 30-counting;
dots ="";
}
while(i<=periods) 
{
dots+=(".");
System.out.println(first + dots + second);
i=i+1;
}
}
}
