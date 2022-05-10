//Create an ArrayList which will be able to store only Strings. 
//Create a printAll method which will print all the elements using an Iterator.
import java.util.*;
class Demo2  
{
public static void main(String[] args)
{
ArrayList<String> list= new ArrayList<>();
list.add("Aarti");
list.add("wetal");
list.add("Aaksh");
list.add("Adhav  \n");
list.add("Vaishali");
list.add("Jahagirdar");
list.add("Akash");
list.add("Kharat");
System.out.println("The list is: \n"+ list);
Iterator<String> iter= list.iterator();
System.out.println("\nThe iterator values"+ " of list are: ");
while (iter.hasNext()) {
System.out.print(iter.next() + " ");
}
}
}


