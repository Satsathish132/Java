//Write a program to sort an ArrayList of Strings in both ascending and descending order
import java.util.*;
public class arrayLists {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        array.add(5);
        array.add(3);
        array.add(1);
        System.out.println("ascending order");
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array,Collections.reverseOrder());
        System.out.println("descending order");
        System.out.println(array);
        
    }
}
