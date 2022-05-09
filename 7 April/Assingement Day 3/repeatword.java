//Write a program that asks the user to enter a word. The program will then repeat word for as many times as it has characters:
//Enter a word:
//Hello
//Hello
//Hello
//Hello
//Hello
//Hello
//To do this you will need to use the length() method of String that counts the number of characters in a string:
//String inputString;
//int times;
//. . . .
//times = inputString.length()
import java.util.*;
class repeatword
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1;
int times,i=0;
System.out.println(" Enter Your word");
s1=sc.next();
times = s1.length();
while(i<=times)
{
System.out.println(s1);
i=i+1;
}

}
}
