//write a program to check whethere a letter is vowl or constant.
import java.util.*;

class checkVorC
{
public static void main(String[] args)
{
String s1;
char a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a chareter");
s1=sc.next();
a=s1.charAt(0);
if(a == 'a' || a == 'e' || a =='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
{
System.out.println(a+"is a Vowl");
} 
else 
{
System.out.println(a+" is a Consonant\n");
}  
}
}