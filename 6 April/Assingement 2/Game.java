//Exercise 4 — Fantasy Game
//In a new role-playing fantasy game players must design their character by picking a point value
//for each of three characteristics:
//• Strength, from 1 to 10
//• Health, from 1 to 10
//• Luck, from 1 to 10
//Write a program that asks for a name for the character and asks for the point value of for each of
//the three characteristics. However, the total points must be less than 15. If the total exceeds 15,
//then 5 points are assigned to each characteristic
/*Welcome to Yertle's Quest
Enter the name of your character:
Chortle
Enter strength (1-10):
8
Enter health (1-10):
4
Enter luck (1-10):
6
You have to give your character too many points! Default values have been
assigned:
Chortle, strength: 5, health: 5, luck: 5
(This user interface*/
import java.util.*;
class Game 
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
String name;
int strength,health,luck,total;
System.out.println("Welcome to Yertle's Quest");
System.out.println("Enter the name of your character");
name=sc.next();
System.out.println("Enter Strength: (0 to 10) ");
strength=sc.nextInt();
System.out.println("Enter Health: (0 to 10) ");
health=sc.nextInt();
System.out.println("Enter Luck: (0 to 10) ");
luck=sc.nextInt();
total = strength + health + luck;
if(total >15)
{
System.out.println("You have give your character too many points!");
System.out.println(name);
System.out.print("strength: 5, health: 5, luck: 5");
}
else 
{
System.out.println("The total for your game is " +total);
}
}
}

