//Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//Basic Salary <= 10000 : HRA = 20%, DA = 80%
//Basic Salary <= 20000 : HRA = 25%, DA = 90%
//Basic Salary > 20000 : HRA = 30%, DA = 95%
import java.util.*;
class salary
{
public static void main(String[] args)
{
double Basic_salary,HRA,Calculated_HRA,DA,cA,Calculated_DA,Gross;
Scanner  sc= new Scanner(System.in);
System.out.println("Enter a basic salary of an employee ");
Basic_salary=sc.nextDouble();
System.out.println("Enter a HRA of an employee ");
HRA=sc.nextDouble();
System.out.println("Enter a DA of an employee ");
DA=sc.nextDouble();
Calculated_HRA=Basic_salary*(HRA/100); 
Calculated_DA= Basic_salary*(DA/100); 
Gross= Basic_salary +Calculated_HRA+Calculated_DA;
System.out.println("Your Gross Salary is :"+Gross);
}
}
