import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class LinearSearch{
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);      
ArrayList<Integer> r= new ArrayList<>();
        r.add(10);
        r.add(20);
        r.add(30);
        r.add(40);
        r.add(50);
System.out.println("Enter the searching element");
        int t=sc.nextInt();
        boolean found = linearSearch(r, t);
        if (found) {
            System.out.println("Searching Element: " + t + " was found");
        } else {
            System.out.println("Searching Element " + t+ " was not found");
        }
    }
    public static <T> boolean linearSearch(Iterable<T> collection, T target) {
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            T current = iterator.next();
            if (current.equals(target)) {
                return true; 
            }
        }
        return false; 
    }
}
