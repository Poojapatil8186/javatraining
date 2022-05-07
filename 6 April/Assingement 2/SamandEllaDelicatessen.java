/*You have been asked to write a program for the Sam and Ella Delicatessen. 
The program takes daily orders from the Internet. 
It asks for the item, its price in cents, and if express delivery is wanted. 
The program writes out the order and the charges. 
Regular delivery for items under $10 is $2.00; for items $10 or more delivery is free. 
For express delivery add $3.00.

Enter the item: Tuna Salad
Enter the price: 4.50
Overnight delivery (0==no, 1==yes): 1
Invoice:
Tuna Salad 4.50
delivery 5.00
total 9.50*/
import java.util.*;
class SamandEllaDelicatessen 
{
public static void main(String [] args) 
{
String item;
char shipping;
float  price, final_shipping, total;
Scanner sc=new Scanner(System.in);
System.out.println("enter the item : ");
item=sc.next();
Scanner ab=new Scanner(System.in);
System.out.println("Enter the price : ");
price=ab.nextFloat();
Scanner bc=new Scanner(System.in);
System.out.println("Would you like overnight shipping? Y/N ");
shipping=bc.next().charAt(0);
if (shipping == 'Y' && price > 10) 
{
final_shipping = 3;
total= final_shipping+ price;
System.out.println("\n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);
} 
else if (shipping == 'Y' && price < 10) 
{
final_shipping = 2+3;
total =shipping + price;
System.out.println("\n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);
}
else if (shipping == 'N' && price > 10) {
final_shipping = 3;
total = final_shipping + price;
System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);
} 
else 
{
final_shipping = 2+3;
total = final_shipping + price;
System.out.println("Invoice: \n" + item + "\n" + "Price: $ " + price + "\n" + "Shipping: " + "$" + final_shipping + "\n" + "Total: $ " + total);
}
}
}