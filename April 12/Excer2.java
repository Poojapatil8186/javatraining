/*Create a class that . 
Each planet has a name, a distance from the sun,
 and its gravity relative to Earth’s gravity.
  For distance and gravity, use the type double 
 which captures real numbers. Make objects for Earth and your favorite non-earth planet.*/
 
class Excer 
{
String name;
double distToSun;
double relGravity;
  
Planets() 
{
this.name = name;
this.distToSun = distToSun;
this.relGravity = relGravity;
}  
void Display()
{
System.out.println("Planet: Name = {0}, Distance = {1:F3} km, Gravity = {2:F3} %"+name+distToSun+ relGravity);
}
}
class CapturesPlanet
{
public static void main(String[] args)
{
// Make objects
Planet earth = new Planet("Earth", 149.6 * 1000000 /* 149.6 mln km */, 1); ;
Planet favoritePlanet = new Planet("Mars", 227.9 * 1000000 /* 227.9 mln km */, 0.394 /* is 39.4% of the earth*/);
// Display data
earth.Display();
favoritePlanet.Display();
}
}
