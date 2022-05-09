//WHILE LOOP 
//write a programe to take from a user and find its factorial number
import java.util.*;
class factorial
{
public static void main(String[] args)
 {
 int i=1,n;
int sum=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();

while(i<=n)
{
sum=sum*i;
i=i+1;
}
System.out.println("factorial is \n"+sum);
}
}