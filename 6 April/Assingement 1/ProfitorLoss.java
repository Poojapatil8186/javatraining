 //write a program to calculate profit or loss.  
 import java.util.*;
class ProfitorLoss
{
public static void main(String[] args)
{
int cp,sp,amount;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a cost price");
cp=sc.nextInt();
System.out.println("Enter a selling price");
sp=sc.nextInt(); 
amount=cp-sp;
if(cp>sp)
{
System.out.println("You got a loss"+amount);
}
else 
{
if(sp>cp)
{
System.out.println("You got a Profit"+amount);
}
else
{
System.out.println("Nither Profit Nither loss"+amount);
}
}
}
}






      