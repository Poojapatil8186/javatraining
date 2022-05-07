//write a program to check whethere a year is leap year or not.

import java.util.*;

class checkyear
{
public static void main(String[] args)
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Year");
year=sc.nextInt();
if(year % 4==0 && year % 100!=0)
{
System.out.println("This year is a leap year");
}
else
{
if(year%100==0)
{
System.out.println("This year is not a leap year");
}
else 
{
if(year%400==0)
{
System.out.println("This year is a leap year");
}
else
{
System.out.println("This year is not a leap year");
}
}
}
}
}
