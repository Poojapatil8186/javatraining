//WHILE LOOP sum
import java.util.*;
class sum
{
public static void main(String[] args)
 {
 int i=1,n;
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();

while(i<=n)
{
sum=sum+i;
i=i+1;
}
System.out.println("Addition is"+sum);
}
}