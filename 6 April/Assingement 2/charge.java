/*The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash.
They charge $8 for each additional hundred pounds beyond the first 200. Write a program that
asks for the weight of a load of trash and then calculates the charge.*/
import java.util.*;
class Charge
{
public static void main(String[] args) 
{
int weight,totCharge=0,i;
System.out.println("Enter the weight of a load : ");
Scanner sc=new Scanner (System.in);
weight=sc.nextInt();
totCharge+=20;
weight=weight-200;
if(weight>0)
{
i=weight/100;
i=i*8;
totCharge+=i;

/*while(i<200)
{
totCharge=20+8;
System.out.println(" Dump Charges is = "+totCharge +"$");
i=i+1;                       
}
else(weight>=200)
{ */                                                                                                                                                                   
System.out.println(" Dump Charges is :"+ totCharge);
}
}
}






