//Create a class that captures students.
// Each student has a first name, last name, class year, and major. 
//Create two examples of students.
import java.util.*;
class Student1 
{

String fname;
String lname;
int clsyear;
String major;

Student1(){
Scanner sc=new Scanner(System.in);
System.out.println("enter first name of student");
fname=sc.next();
System.out.println("enter last  name of student");
lname=sc.next();
System.out.println("enter  class year  of student");
clsyear=sc.nextInt();
System.out.println("enter major of student");
major=sc.next();
}
void show(){
System.out.println("name of first student is : "+fname +" " +lname);
System.out.println("class year of first student is: "+clsyear);
System.out.println("majorfirst student is : "+major);
}
}
class Student2 
{

String fname1;
String lname1;
int clsyear1;
String major1;

Student2(){
Scanner sc=new Scanner(System.in);
System.out.println("enter first name of second  student");
fname1=sc.next();
System.out.println("enter last  name of  second student");
lname1=sc.next();
System.out.println("enter  class year second  of student");
clsyear1=sc.nextInt();
System.out.println("enter major of  second student");
major1=sc.next();
}
void show1(){
System.out.println("name of second student is : "+fname1 +" "+lname1);
System.out.println("class year of second student is: "+clsyear1);
System.out.println("major of second  student is : "+major1);
}
}
class Excer1{
public static void main ( String[] args )
{
Student1 stu1=new Student1();
stu1.show();
"*******************************************************"
Student2 stu2=new Student2();
stu2.show1();
}
}
