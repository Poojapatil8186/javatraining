import java.util.*;
class Armstrong 
{
public static void main(String[] args) 
{
 int n1,OriginalNumber, remainder, result = 0;
 System.out.println("Enter 3 digit number");
 Scanner sc=new Scanner(System.in);
 n1=sc.nextInt();
OriginalNumber = n1;
while (OriginalNumber!= 0)
{
remainder = OriginalNumber % 10;
result += Math.pow(remainder, 3);
OriginalNumber /= 10;
}
if(result == n1)
{
System.out.println(n1 + " is an Armstrong number.");
}
else
{
System.out.println(n1 + " is not an Armstrong number.");
}
}
}