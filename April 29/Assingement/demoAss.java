/*Create an ArrayList which will be able to store only Strings. Create a printAll method which will print 
all the elements using an Iterator.*/
import java.util.*;

class DemoAss {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("s");
		list.add("o");
		list.add("n");
		list.add("i");
		System.out.println("using listiterator");
      ListIterator it1;
      it1=list.listIterator();
    
      System.out.println("Forward.....");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        
        System.out.println("Backward.....");
        while(it1.hasPrevious()){
            System.out.println(it1.previous());
        }


		}
}
