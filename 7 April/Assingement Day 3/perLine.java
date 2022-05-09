/*Write a program that asks the user to enter a word. The program then writes that word one character per line:
Enter a word: turtle
t
u
r
t
l
e
Use the length() method that counts the number of characters in a string and the charAt( int index ) that returns the character at index.
Recall that String indexes start at zero.*/
import java.util.*;
class perLine
{
public static void main(String[] args)
{
String a;
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println(" Enter  your word");
a=sc.next();
char c=a.charAt(0);
//if(
//{
System.out.println(" " +a.charAt(i));
}
}
/*int c,state;
state = IN;
while((c=getchar()) != EOF) 
{
if(c==' ' || c == '\t')
state=OUT;
else if (state == OUT) 
{
state=IN;
System.out.println('\n');
System.out.println(c);
}
else
{
System.out.println(c);
}
}
}
}*/