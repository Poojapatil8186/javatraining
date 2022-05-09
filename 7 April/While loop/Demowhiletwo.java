//WHILE LOOP print Nth number of times.
import java.util.Scanner;
class Demowhiletwo 
{
public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int i=1;
while(i<=n)
{
System.out.println(i);
i=i+1;
}
}
}